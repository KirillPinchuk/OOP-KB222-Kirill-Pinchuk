package lab_01;
import java.util.Scanner;

public class task2  {
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
         System.out.println("Введіть кількість секунд з півночі:");
         int totalSeconds = console.nextInt();
         console.close();

         int hours = totalSeconds / 3600;
         int remainingSecondsAfterHours = totalSeconds % 3600;
         int minutes = remainingSecondsAfterHours / 60;
         int seconds = remainingSecondsAfterHours % 60;
         System.out.printf("%d:%02d:%02d\n", hours, minutes, seconds);
     }
}