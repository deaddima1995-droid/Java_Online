package by.dmitry.course.classes.object.task8;

import java.util.Random;

public class CustomerUtils {
    private final static Random RND = new Random();
    private final static String[] names = {"Dmitry", "Ivan", "Vasiliy"};
    private final static String[] surnames = {"Ivanov", "Petrov", "Sidorov"};
    private final static String[] patronymics = {"Ivanovich", "Petrovich", "Sidorovich"};
    private final static String[] addresses = {"Minsk", "Gomel", "Moscow", "Kiev"};

    public static Customer createRandomCustomer() {
        return new Customer(
                names[RND.nextInt(names.length)],
                surnames[RND.nextInt(surnames.length)],
                patronymics[RND.nextInt(patronymics.length)],
                addresses[RND.nextInt(addresses.length)],
                RND.nextInt(1000),
                RND.nextInt(100)
        );
    }
}
