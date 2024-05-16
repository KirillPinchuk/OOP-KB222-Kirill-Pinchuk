package lab_01;
import java.util.Scanner;

public class task8 {
 public static void main(String[] args) {
  Scanner console = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input;

        System.out.println("Введіть цілі числа (останнє 0): ");
        
        while ((input = console.nextInt()) != 0) {
            sum += input;
            count++;
        }

        double average = (double) sum / count;

        System.out.println("Середнє значення: " +average);

 }
}