package by.dmitry.course.algorithmization.sorted;

public class Task7 {

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5, 6, 7};
        int[] secondArray = {2, 3, 4, 5, 6, 7, 8};

        for (int j : secondArray) {
            int index = Task5.binarySearch(firstArray, 0, firstArray.length, j);
            firstArray = insertNumberToArray(firstArray, index, j);
        }
        for (int j : firstArray) {
            System.out.print("\t" + j);
        }
    }

    public static int[] insertNumberToArray(int[] array, int index, int number) {
        int[] out = new int[array.length + 1];
        if (index >= 0) {
            System.arraycopy(array, 0, out, 0, index);
        }
        out[index] = number;
        if (out.length - (index + 1) >= 0) {
            System.arraycopy(array, index, out, index + 1, out.length - (index + 1));
        }
        return out;
    }
}
