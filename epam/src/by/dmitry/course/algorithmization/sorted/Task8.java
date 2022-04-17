package by.dmitry.course.algorithmization.sorted;

public class Task8 {

    public static void main(String[] args) {
        int[] numerator  = {2,5,3,7,6};
        int[] denominator = {2,4,4,8,8};
        makeCommonDenominator(numerator,denominator);
        Task6.sortShell(numerator);

        for (int i = 0; i < numerator.length; i++) {
            System.out.printf("\t%s/%s",numerator[i],denominator[i]);
        }
    }

    public static void makeCommonDenominator(int[] numerator, int[] denominator) {
        int den = 1;
        for (int i = 0; i < denominator.length; i++) {
            den *= denominator[i];
        }
        for (int i = 0; i < denominator.length; i++) {
            numerator[i] = (den / denominator[i]) * numerator[i];
            denominator[i] = den;
        }
    }
}
