package lab_02.task1;
import java.util.Scanner;

public class line {
	double k;
    double b;
    
    public line(double k, double b) {
        this.k = k;
        this.b = b;
    }
    
    public point intersection(line other) {
        if (this.k == other.k) {
            return null;
        }
        
        double x = (other.b - this.b) / (this.k - other.k);
        double y = this.k * x + this.b;
        
        return new point(x, y);
    }
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Введіть значення k та b для першої прямої:");
        double k1 = console.nextDouble();
        double b1 = console.nextDouble();
        
        System.out.println("Введіть значення k та b для другої прямої:");
        double k2 = console.nextDouble();
        double b2 = console.nextDouble();
        
        line line1 = new line(k1, b1);
        line line2 = new line(k2, b2);
        
        if (line1.intersection(line2) != null) {
            System.out.println("Точка перетину: " + line1.intersection(line2));
        } else {
            System.out.println("Прямі збігаються або паралельні, немає точки перетину.");
        }
        
        console.close();
    }
}