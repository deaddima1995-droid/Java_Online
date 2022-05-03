package by.dmitry.course.classes.object.task1;

public class Main {

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println(test1);
        test1.setFirstNumber(15);
        test1.setSecondNumber(3);
        System.out.println(test1);
        System.out.println(test1.getSumOfNumbers());
        System.out.println(test1.getBiggerNumber());
    }
}
