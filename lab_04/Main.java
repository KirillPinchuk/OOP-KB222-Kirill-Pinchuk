package lab_04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть тип фігури, яку ви хочите обсилити (Трикутник(1) / Чотирикутник(2) / Коло(3)):");
        int choice = scanner.nextInt();

        switch (choice) {
        case 1:
            System.out.println("Введіть координати трикутника (x1 y1 x2 y2 x3 y3):");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();
            Point a = new Point(x1, y1);
            Point b = new Point(x2, y2);
            Point c = new Point(x3, y3);
            Triangle triangle = new Triangle(a, b, c);
            System.out.println("Трикутник: " + triangle);
            System.out.println("Площа: " + triangle.area());
            System.out.println("Центроїд: " + triangle.centroid());
            break;
        case 2:
            System.out.println("Введіть координати чотирикутника (x1 y1 x2 y2 x3 y3 x4 y4):");
            double x1q = scanner.nextDouble();
            double y1q = scanner.nextDouble();
            double x2q = scanner.nextDouble();
            double y2q = scanner.nextDouble();
            double x3q = scanner.nextDouble();
            double y3q = scanner.nextDouble();
            double x4q = scanner.nextDouble();
            double y4q = scanner.nextDouble();
            Point Aq = new Point(x1q, y1q);
            Point Bq = new Point(x2q, y2q);
            Point Cq = new Point(x3q, y3q);
            Point Dq = new Point(x4q, y4q);
            Quadrilateral quadrilateral = new Quadrilateral(Aq, Bq, Cq, Dq);
            System.out.println("Чотирикутник: " + quadrilateral);
            System.out.println("Площа: " + quadrilateral.area());
            System.out.println("Центроїд: " + quadrilateral.centroid());
            break;
        case 3:
            System.out.println("Введіть координати центра кола (x y) та радіус:");
            double xc = scanner.nextDouble();
            double yc = scanner.nextDouble();
            double radius = scanner.nextDouble();
            Point center = new Point(xc, yc);
            Circle circle = new Circle(center, radius);
            System.out.println("Коло: " + circle);
            System.out.println("Площа: " + circle.area());
            System.out.println("Центроїд: " + circle.centroid());
            break;
        default:
            System.out.println("Invalid choice!");
    }

    scanner.close();
    }
}