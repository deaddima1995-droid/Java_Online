package by.dmitry.course.algorithmization.decomposition;

public class Task5 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 3, 5, 7, 8, 9, 10};
        int nextValue = getLowValueThenMaxValue(array, getMaxValue(array));
        System.out.printf("This value -  %s smaller than Max value - %s, but bigger than others", nextValue, getMaxValue(array));
    }

    public static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int j : array) {
            max = Math.max(max, j);
        }
        return max;
    }

    public static int getLowValueThenMaxValue(int[] array, int max) {
        int out = Integer.MIN_VALUE;
        for (int j : array) {
            if (j != max) {
                out = Math.max(out, j);
            }
        }
        return out;
    }

}
