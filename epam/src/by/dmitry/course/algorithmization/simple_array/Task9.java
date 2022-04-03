package by.dmitry.course.algorithmization.simple_array;

import java.util.Arrays;

public class Task9 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 3, 2, 5, 2, 8, 8, 1, 1, 1, 1, 2, 3, 2, 1, 2};
        int counter = 0;
        int temp = 1;
        int index = 0;
        Arrays.sort(array);
        for (int count = 0; count < array.length - 1; count++) {
            if (array[count] == array[count + 1]) {
                if (counter < temp) {
                    index = count;
                }
                temp++;
            }
            if (array[count] != array[count + 1]) {
                if (counter < temp) {
                    counter = temp;
                }
                temp = 1;
            }
        }
        System.out.printf("Max repeat number %s with counts %s", array[index], counter);
    }
}
