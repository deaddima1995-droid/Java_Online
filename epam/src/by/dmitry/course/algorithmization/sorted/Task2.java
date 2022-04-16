package by.dmitry.course.algorithmization.sorted;

public class Task2 {

    public static void main(String[] args) {
        int[] firstArray = {1, 3, 3, 5, 7, 9, 11};
        int[] secondArray = {2, 4, 6, 6, 8, 10, 12};
        int firstI = 0;
        int secondI = 0;

        for (int i = 0; i < firstArray.length + secondArray.length; i++) {
            if (firstI >= firstArray.length || secondI >= secondArray.length) {
                if (firstI >= firstArray.length) {
                    System.out.print("\t" + secondArray[secondI]);
                    secondI++;
                } else {
                    System.out.print("\t" + firstArray[firstI]);
                    firstI++;
                }
            } else {
                if (firstArray[firstI] < secondArray[secondI]) {
                    System.out.print("\t" + firstArray[firstI]);
                    firstI++;
                } else {
                    System.out.print("\t" + secondArray[secondI]);
                    secondI++;
                }
            }
        }
    }
}
