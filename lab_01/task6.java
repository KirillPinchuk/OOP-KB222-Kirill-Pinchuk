package lab_01;
import java.util.Scanner;

public class task6 {
 public static void main(String[] args) {
  Scanner console = new Scanner(System.in);
  
  System.out.println("Введiть загальний рахунок: ");
        int totalBill = console.nextInt();
        System.out.println("Введiть кількість друзiв: ");
        int numberOfFriends = console.nextInt();

        if (totalBill <= 0 || numberOfFriends <= 0) {
            System.out.println("Invalid input");
            return;
        }

        double eachPayment = (totalBill + 0.1 * totalBill) / numberOfFriends;

        System.out.printf("Оплата рахунку на 1 людину: %.2f", eachPayment);
 }
}