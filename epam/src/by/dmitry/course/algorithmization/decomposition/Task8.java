package by.dmitry.course.algorithmization.decomposition;

public class Task8 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sumOfThreeNumbers(array, 6));
    }

    public static int sumOfThreeNumbers(int[] array, int start) {
        int out = 0;
        for (int i = 0; i < 3; i++) {
            try {
                out += array[start + i];
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        return out;
    }
}
