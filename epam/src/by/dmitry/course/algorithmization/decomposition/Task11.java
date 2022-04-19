package by.dmitry.course.algorithmization.decomposition;

public class Task11 {

    public static void main(String[] args) {
        int numberA = 1234;
        int numberB = 12345;
        System.out.printf("Number %s the biggest", getNumberWithMoreNumbers(numberA, numberB));
    }

    public static int getNumberWithMoreNumbers(int numberOne, int numberTwo) {
        int countOne = Task10.getCountNumbers(numberOne);
        int countTwo = Task10.getCountNumbers(numberTwo);
        if (countOne >= countTwo) {
            return numberOne;
        } else {
            return numberTwo;
        }
    }
}
