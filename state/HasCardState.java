package state;

class HasCardState implements ATMState {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Карта уже вставлена");
    }
    
    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Карта извлечена");
        atm.setCurrentState(atm.getNoCardState());
    }
    
    @Override
    public void enterPin(ATM atm, int pin) {
        if (pin == atm.getCorrectPin()) {
            System.out.println("PIN принят");
            atm.setCurrentState(atm.getWithdrawalState());
        } else {
            System.out.println("Неверный PIN");
            atm.setCurrentState(atm.getNoCardState());
        }
    }
    
    @Override
    public void requestCash(ATM atm, int amount) {
        System.out.println("Сначала введите PIN");
    }
}
