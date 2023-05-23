import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координаты первой точки (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Введите координаты второй точки (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.print("Введите координаты третьей точки (x3, y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x = (x1 + x2 + x3) / 3;
        double y = (y1 + y2 + y3) / 3;

        System.out.printf("Барицентр треугольника: (%.4f, %.4f)", x, y);
    }
}