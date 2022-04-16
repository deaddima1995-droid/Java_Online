package by.dmitry.course.algorithmization.sorted;

public class Task5 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7, 6, 4, 0};

        for (int i = 1; i < array.length; i++) {
            int key = array[i - 1];
            if (array[i - 1] > array[i]) {
                int temp = binarySearch(array, 0, i, key);
                int tempest = array[temp];
                array[temp] = array[i];
                array[i] = tempest;
                i = (i != 1) ? i - 2 : 0;
            }
        }
        for (int j : array) {
            System.out.print("\t" + j);
        }
    }

    public static int binarySearch(int[] array, int firstIndex, int lastIndex, int key) {
        int mid = firstIndex + (lastIndex - firstIndex) / 2;

        if (array[mid] == key) {
            return mid;
        } else if (array[mid] > key) {
            return binarySearch(array, firstIndex, mid, key);
        } else {
            return binarySearch(array, mid + 1, lastIndex, key);
        }
    }
}
