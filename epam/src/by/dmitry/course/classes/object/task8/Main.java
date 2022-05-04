package by.dmitry.course.classes.object.task8;

public class Main {

    public static void main(String[] args) {
        CustomerStorage customerStorage = new CustomerStorage();
        for (int i = 0; i < 10; i++) {
            customerStorage.addCustomer(CustomerUtils.createRandomCustomer());
        }
        customerStorage.printSortedListByName();
        customerStorage.printSortedListByCardNumberInRange(500);
        customerStorage.deleteCustomer(1);
        customerStorage.addCustomer(CustomerUtils.createRandomCustomer());
        System.out.println(customerStorage);

    }
}
