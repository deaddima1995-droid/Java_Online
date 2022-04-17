package by.dmitry.course.algorithmization.sorted;

public class Task6 {

    public static void main(String[] args) {
        int[] array = {8, 7, 6, 5, 4, 3, 2, 1, 9};
        sortShell(array);
        for (int numb : array) {
            System.out.print("\t" + numb);
        }
    }

    public static void sortShell(int[] array) {
        for (int step = array.length / 2; step > 0; step /= 2) {
            for (int i = step; i < array.length; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
                    int x = array[j];
                    array[j] = array[j + step];
                    array[j + step] = x;
                }
            }
        }
    }
}
