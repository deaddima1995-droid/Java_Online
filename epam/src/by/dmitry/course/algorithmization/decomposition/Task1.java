package by.dmitry.course.algorithmization.decomposition;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(getNOK(-5,3));
    }

    public static int getNOK(int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber) / getNOD(firstNumber, secondNumber);
    }

    public static int getNOD(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return getNOD(secondNumber, firstNumber % secondNumber);
    }
}
