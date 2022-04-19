package by.dmitry.course.algorithmization.decomposition;

public class Task6 {

    public static void main(String[] args) {
        System.out.println(IsMutuallyPrimeNumbers(8,15,49));
    }

    public static boolean IsMutuallyPrimeNumbers(int... numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (Task1.getNOD(numbers[i - 1],numbers[i]) == 1) {
                return true;
            }
        }
        return false;
    }
}
