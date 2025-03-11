package state;

interface ATMState {
    void insertCard(ATM atm);
    void ejectCard(ATM atm);
    void enterPin(ATM atm, int pin);
    void requestCash(ATM atm, int amount);
}
