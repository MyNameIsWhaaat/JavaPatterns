package state;

public class NoCardState implements ATMState{
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Карта вставлена");
        atm.setCurrentState(atm.getHasCardState());
    }
    
    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Невозможно извлечь несуществующую карту");
    }
    
    @Override
    public void enterPin(ATM atm, int pin) {
        System.out.println("Сначала вставьте карту");
    }
    
    @Override
    public void requestCash(ATM atm, int amount) {
        System.out.println("Операция невозможна без карты");
    }
}
