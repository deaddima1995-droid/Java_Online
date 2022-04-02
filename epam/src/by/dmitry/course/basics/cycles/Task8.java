package by.dmitry.course.basics.cycles;

public class Task8 {

    public static void main(String[] args) {
        // Нужно подумать, скорее всего можно через побитовые операции
        int numberM = 123456;
        int numberN = 246789;

        for (int x = numberM; x > 0; x /= 10)
            for (int y = numberN; y > 0; y /= 10)
                if (x % 10 == y % 10) {
                    System.out.print(x % 10 + "\t");
                }
    }
}
