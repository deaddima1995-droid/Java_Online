package by.dmitry.course.algorithmization.simple_array;

public class Task7 {

    public static void main(String[] args) {
        double[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double max = -Double.MAX_VALUE;

        for (int counter = 0; counter < array.length - 1; counter++) {

            double temp = array[counter] + array[counter + 1];
            if (max < temp) {
                max = temp;
            }
            System.out.print(array[counter] + " ");
        }
        System.out.print(array[array.length - 1]);
        System.out.println("\nMax = " + max);
    }
}
