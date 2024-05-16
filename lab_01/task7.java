package lab_01;
import java.util.Scanner;

public class task7 {
 public static void main(String[] args) {
  Scanner console = new Scanner(System.in);

        int maxValue = -1;
        int input;
        
        System.out.println("Введіть цілі числа (останнє 0): ");
        
        while ((input = console.nextInt()) != 0) {
            if (input > maxValue) {
                maxValue = input;
            }
        }

        System.out.println("Найбільше число: " +maxValue);

 }
}