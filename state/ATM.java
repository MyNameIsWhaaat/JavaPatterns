package state;

public class ATM {
    private ATMState currentState;
    private ATMState noCardState;
    private ATMState hasCardState;
    private ATMState withdrawalState;
    
    private int correctPin = 1234;
    private int accountBalance = 10000;
    
    public ATM() {
        noCardState = new NoCardState();
        hasCardState = new HasCardState();
        withdrawalState = new WithdrawalState();
        
        currentState = noCardState;
    }
    
    public void setCurrentState(ATMState state) {
        this.currentState = state;
    }
    
    public ATMState getNoCardState() {
        return noCardState;
    }
    
    public ATMState getHasCardState() {
        return hasCardState;
    }
    
    public ATMState getWithdrawalState() {
        return withdrawalState;
    }
    
    public int getCorrectPin() {
        return correctPin;
    }
    
    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int balance) {
        this.accountBalance = balance;
    }
    
    public void insertCard() {
        currentState.insertCard(this);
    }
    
    public void ejectCard() {
        currentState.ejectCard(this);
    }
    
    public void enterPin(int pin) {
        currentState.enterPin(this, pin);
    }
    
    public void requestCash(int amount) {
        currentState.requestCash(this, amount);
    }
}
