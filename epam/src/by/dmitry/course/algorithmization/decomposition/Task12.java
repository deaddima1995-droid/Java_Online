package by.dmitry.course.algorithmization.decomposition;

public class Task12 {

    public static void main(String[] args) {
        int numberK = 13;
        int numberN = 170;
        int[] out = generateMemberOfArray(numberK, numberN);
        printArray(out);
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print("\t" + j);
        }
    }

    public static int[] addNumberToArray(int[] array, int number) {
        int[] temp = new int[array.length + 1];
        System.arraycopy(array, 0, temp, 0, array.length);
        temp[temp.length - 1] = number;
        return temp;
    }

    public static int[] generateMemberOfArray(int k, int n) {
        int i = 0;
        int[] array = new int[0];
        while (i <= n) {
            if (arraySum(Task10.getArrayFromNumber(i)) == k) array = addNumberToArray(array, i);
            i++;
        }
        return array;

    }

    public static int arraySum(int[] array) {
        int sum = 0;

        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
