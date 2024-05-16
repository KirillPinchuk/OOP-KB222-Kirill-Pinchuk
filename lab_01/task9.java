package lab_01;
import java.util.Scanner;

public class task9 {
 public static void main(String[] args) {
  Scanner console = new Scanner(System.in);

        System.out.println("Введіть коефіцієнти a, b, c для квадратного рівняння: ");
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Результат: " + x1 + " " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Результат: " + x);
        } else {
            System.out.println("Результат: no roots");
        }
 }
}