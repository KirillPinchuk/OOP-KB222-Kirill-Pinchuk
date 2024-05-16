package lab_01;
import java.util.Scanner;

public class task4 {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

        int numberOfStrangers;
        do {
            System.out.println("Введіть кількість незнайомців:");
            numberOfStrangers = scanner.nextInt();
        } while (numberOfStrangers <= 0);

        scanner.nextLine(); 
        for (int i = 1; i <= numberOfStrangers; i++) {
            System.out.println("Введіть ім'я незнайомця №" + (i) + ":");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name);
        }
        scanner.close();

 }

}