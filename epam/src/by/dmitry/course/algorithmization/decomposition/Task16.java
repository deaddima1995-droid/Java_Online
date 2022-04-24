package by.dmitry.course.algorithmization.decomposition;

public class Task16 {

    public static void main(String[] args) {
        int n = 3;
        int sum = getSumOfOddNumberFromRange(n);
        System.out.printf("\nSum of %d-range odd digit is %d and it has %d count of even digit", n, sum, getCountEvenDigitFromNumber(sum));
    }

    public static boolean isHasEvenNumber(int number) {
        int temp = number % 10;
        while (number > 0) {
            if (temp % 2 == 0) {
                return true;
            }
            number /= 10;
            temp = number % 10;
        }
        return false;
    }

    public static int getStartRange(int range) {
        int out = 1;
        for (int i = 1; i < range; i++) {
            out = out * 10 + 1;
        }
        return out;
    }

    public static int getFinishRange(int range) {
        int out = 1;
        for (int i = 1; i <= range; i++) {
            out *= 10;
        }
        return out;
    }

    public static int getCountEvenDigitFromNumber(int number) {
        int out = 0;
        while (number > 0) {
            int temp = number % 10;
            if (temp % 2 == 0) {
                out++;
            }
            number /= 10;
        }
        return out;
    }

    public static int getSumOfOddNumberFromRange(int range) {
        int sum = 0;
        for (int i = getStartRange(range); i < getFinishRange(range); i += 2) {
            if (!isHasEvenNumber(i)) {
                System.out.print("\t" + i);
                sum += i;
            } else {
                i = getNextNumber(i) - 2;
            }
        }
        return sum;
    }

    public static int getNextNumber(int number) {
        int[] numbers = Task10.getArrayFromNumber(number);
        int out = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i]++;
            }
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            out *= 10;
            out += numbers[i];
        }
        return out;
    }


}
