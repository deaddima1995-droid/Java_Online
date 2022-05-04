package by.dmitry.course.classes.object.task8;

import java.util.ArrayList;
import java.util.Comparator;

public class CustomerStorage {
    private final ArrayList<Customer> storage;

    public CustomerStorage() {
        this.storage = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        storage.add(customer);
    }

    public void deleteCustomer(Customer customer) {
        storage.remove(customer);
    }

    public void deleteCustomer(int index) {
        if (!storage.isEmpty() && index < storage.size()) {
            storage.remove(index);
        }
    }

    public void printSortedListByName() {
        System.out.println(storage.stream().sorted(Comparator.comparing(Customer::getName)).toList());
    }

    public void printSortedListByCardNumberInRange(int range) {
        System.out.println(storage.stream().filter(customer -> customer.getCardNumber() > range).sorted(Comparator.comparingInt(Customer::getCardNumber)).toList());
    }

    @Override
    public String toString() {
        return "CustomerStorage{" +
                "storage=" + storage +
                '}';
    }
}
