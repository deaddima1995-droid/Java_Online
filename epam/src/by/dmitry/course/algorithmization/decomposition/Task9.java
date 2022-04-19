package by.dmitry.course.algorithmization.decomposition;

public class Task9 {

    public static void main(String[] args) {
        double area = getSquareOfQuadrangle(4, 3, 3, 3);
        if (Double.isNaN(area)) {
            System.out.println("This quadrangle impossible");
        } else {
            System.out.printf("Square is %.2f", area);
        }
    }

    public static double getSquareOfQuadrangle(int x, int y, int z, int t) {
        double area = 0.5 * x * y;
        double thirdSide = Math.sqrt(x * x + y * y);
        double hp = (z + t + thirdSide) / 2;
        area += Math.sqrt(hp * (hp - z) * (hp - t) * (hp - thirdSide));
        return area;
    }
}
