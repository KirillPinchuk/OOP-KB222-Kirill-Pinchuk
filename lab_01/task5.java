package lab_01;
import java.util.Scanner;

public class task5 {
 public static void main(String[] args) {
   Scanner console = new Scanner(System.in);
   
   System.out.println("Введіть значення а:");
      int a = console.nextInt();
      
      System.out.println("Введіть значення b:");
      int b = console.nextInt();
      
      System.out.println("Введіть значення h:");
      int h = console.nextInt();

      int days = 0;
      if (a >= h) {
          days = 1;
      } else if (a <= b) {
          days = -1;
      } else {
          days =(int) Math.ceil((double)(h - a) / (a - b));
      }
     
      if (days == -1) {
          System.out.println("Impossible");
      } else {
          System.out.println("Результат: " + days);
      }

      console.close();

 }

}