package builder;

public class Machine{
    private final String brand;
    private final String model;
    private final int year;
    private final String color;
    private final String engine;
    private final boolean gpsEnabled;

    private Machine(Builder builder){
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.engine = builder.engine;
        this.gpsEnabled = builder.gpsEnabled;
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }
    public String getEngine(){
        return engine;
    }
    public boolean getGpsEnabled(){
        return gpsEnabled;
    }

    @Override
    public String toString(){
        return "Machine{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", year=" + year +
                ", color=" + color +
                ", engine=" + engine +
                ", gpsEnabled=" + gpsEnabled +
                '}';
    }

    public static class Builder{
        private String brand;
        private String model;
        private int year;
        private String color = "White";
        private String engine = "Petrol";
        private boolean gpsEnabled = false;

        public Builder(String brand, String model, int year) {
            if (brand == null || brand.isEmpty()) throw new IllegalArgumentException("Brand cannot be empty");
            if (model == null || model.isEmpty()) throw new IllegalArgumentException("Model cannot be empty");
            if (year < 1886 || year > 2025) throw new IllegalArgumentException("Invalid year");
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public Builder setBrand(String brand){
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model){
            this.model = model;
            return this;
        }

        public Builder setYear(int year){
            this.year = year;
            return this;
        }

        public Builder setColor(String color){
            this.color = color;
            return this;
        }

        public Builder setEngine(String engine){
            this.engine = engine;
            return this;
        }

        public Builder setGpsEnabled(boolean gpsEnabled){
            this.gpsEnabled = gpsEnabled;
            return this;
        }

        public Machine build(){
            return new Machine(this);
        }

    }
}