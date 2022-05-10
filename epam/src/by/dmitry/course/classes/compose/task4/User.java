package by.dmitry.course.classes.compose.task4;

import java.util.HashSet;
import java.util.Set;

public class User {
    private static int ID_COUNTER;
    private final int id;
    private final String name;
    private final Set<BankAccount> bankAccounts = new HashSet<>();

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<BankAccount> getBankAccounts() {
        return bankAccounts;
    }
}
