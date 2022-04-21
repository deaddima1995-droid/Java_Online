package by.dmitry.course.algorithmization.decomposition;

public class Task13 {

    public static void main(String[] args) {
        printPairTwinNumbersFromRange(100);
    }

    public static int[] getPairFromIteration(int iteration) {
        int[] out = new int[2];
        out[0] = 6 * iteration - 1;
        out[1] = out[0] + 2;
        return out;
    }

    public static boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }
        int count = 2;
        while (count * count <= number) {
            if (number % count == 0) {
                return false;
            }
            count += 1;
        }
        return true;
    }

    public static void printPairTwinNumbersFromRange(int range) {
        int[] pair;
        if (range <= 3) {
            System.out.println("\t" + 3 + " " + 5);
        }
        for (int i = 1; i <= 2 * range; i++) {
            pair = getPairFromIteration(i);
            if (isPrimeNumber(pair[0]) && pair[0] >= range && pair[1] <= 2 * range) {
                System.out.print("\t" + pair[0] + " " + pair[1]);
            }
        }
    }
}
