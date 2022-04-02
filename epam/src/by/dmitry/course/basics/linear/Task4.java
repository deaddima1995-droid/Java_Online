package by.dmitry.course.basics.linear;

public class Task4 {
    public static void main(String[] args) {
        double number = 123.456;

        number = Math.round(number) / 1000d + Math.round((number - Math.round(number)) * 1000);
        System.out.println(number);
    }
}
