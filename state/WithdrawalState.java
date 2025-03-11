package state;

public class WithdrawalState implements ATMState {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Операция невозможна");
    }
    
    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Сначала запросите выдачу наличных");
    }
    
    @Override
    public void enterPin(ATM atm, int pin) {
        System.out.println("PIN уже введен");
    }
    
    @Override
    public void requestCash(ATM atm, int amount) {
        if (amount <= atm.getAccountBalance()) {
            System.out.println("Выдано " + amount + " рублей");
            atm.setAccountBalance(atm.getAccountBalance() - amount);
            atm.setCurrentState(atm.getNoCardState());
        } else {
            System.out.println("Недостаточно средств");
        }
    }
}
