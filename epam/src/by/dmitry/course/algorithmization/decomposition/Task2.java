package by.dmitry.course.algorithmization.decomposition;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {15, -5, 5, 25};
        System.out.println(getNOD(array));
    }

    public static int getNOD(int... numbers) {
        int out = 0;
        for (int number : numbers) {
            out = Task1.getNOD(out, Math.abs(number));
        }
        return out;
    }
}
