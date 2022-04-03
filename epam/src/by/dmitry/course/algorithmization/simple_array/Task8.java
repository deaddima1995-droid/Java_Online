package by.dmitry.course.algorithmization.simple_array;

public class Task8 {

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 3, 4, 1, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int min = array[0];
        int counterMin = 0;

        for (int num : array) {
            if (min == num) {
                counterMin++;
            }
            if (min > num) {
                min = num;
                counterMin = 1;
            }
        }
        int[] newArray = new int[array.length - counterMin];
        for (int count = 0, newCount = 0; count < array.length; count++) {
            if (min != array[count]) {
                newArray[newCount] = array[count];
                System.out.print("\t" + newArray[newCount]);
                newCount++;

            }
        }
    }
}
