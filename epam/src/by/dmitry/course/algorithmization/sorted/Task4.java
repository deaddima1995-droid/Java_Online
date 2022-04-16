package by.dmitry.course.algorithmization.sorted;

public class Task4 {

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int countSwap = 0;
        int i = 1;
        while (i < array.length) {
            if (array[i - 1] <= array[i]) {
                i += 1;
            } else {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                countSwap++;
                if (i > 1) {
                    i -= 1;
                }
            }
        }
        System.out.println("Count swap = " + countSwap);
        for (int k : array) {
            System.out.print("\t" + k);
        }

    }
}
