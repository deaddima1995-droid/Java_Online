package by.dmitry.course.algorithmization.decomposition;

public class Task3 {

    public static void main(String[] args) {
        int line = 5;
        System.out.printf("Answer is - %.2f", getSquareOfRegularHexagon(line));
    }

    static double getSquareOfRegularHexagon(int line) {
        return getSquareOfTriangle(line) * 6;
    }

    static double getSquareOfTriangle(int line) {
        return (Math.sqrt(3) / 4) * line * line;
    }
}
