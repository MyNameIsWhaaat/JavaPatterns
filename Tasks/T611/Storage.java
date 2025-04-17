package Tasks.T611;

public class Storage<T> {
    private final T obj;
    private final boolean allowNull;

    private static final Storage<?> NULL_INSTANCE = new Storage<>(null, true);

    // Приватный конструктор
    private Storage(T obj, boolean allowNull) {
        this.obj = obj;
        this.allowNull = allowNull;
    }

    // ✅ Метод для создания хранилища, разрешающего null (только один instance с null)
    @SuppressWarnings("unchecked")
    public static <T> Storage<T> allowNull(T obj) {
        if (obj == null) {
            return (Storage<T>) NULL_INSTANCE;
        }
        return new Storage<>(obj, true);
    }

    // ✅ Метод для создания хранилища, не разрешающего null (бросает исключение при извлечении null)
    public static <T> Storage<T> disallowNull(T obj) {
        return new Storage<>(obj, false);
    }

    // ✅ Метод получения объекта: альтернатива (если null и разрешено)
    public T getOrElse(T alternative) {
        if (obj == null) {
            if (!allowNull) {
                throw new IllegalStateException("Null value is not allowed in this Storage");
            }
            return alternative;
        }
        return obj;
    }

    // ✅ Метод прямого доступа
    public T get() {
        return getOrElse(null);
    }
}
