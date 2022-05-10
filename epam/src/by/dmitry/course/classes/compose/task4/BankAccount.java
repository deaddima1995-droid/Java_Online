package by.dmitry.course.classes.compose.task4;

public class BankAccount {

    private static int ID_COUNTER = 0;
    private final int numberAccount;
    private int value;
    private boolean active = true;

    private BankAccount(int value) {
        this.numberAccount = ++ID_COUNTER;
        this.value = value;
    }

    public static BankAccount createAccount(int value) {
        return new BankAccount(value);
    }

    public void blockingAccount() {
        this.active = false;
    }

    public boolean isActive() {
        return active;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
