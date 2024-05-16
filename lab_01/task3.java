package lab_01;
import java.util.Scanner;

public class task3 {
 private static final int password = 123456789;
 
 public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
         System.out.println("Введіть пароль:");
         int inputPassword = console.nextInt();
         console.close();

         if (inputPassword == password) {
             System.out.println("Hello, Agent");
         } else {
             System.out.println("Access denied");
         }
    }
}