package lab_01;
import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int size = console.nextInt();
        while (size <= 0) {
            System.out.println("Кількість елементів масиву повинна бути більше нуля.");
            System.out.print("Введіть кількість елементів масиву: ");
            size = console.nextInt();
        }
        
        int[] array = new int[size];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = console.nextInt();
        }
    
        System.out.print("Введіть зсув: ");
        int shift = console.nextInt();
        while (shift <= 0 || shift > array.length) {
         System.out.println("Невірне значення зсуву! Введіть ще раз: ");
            shift = console.nextInt();
        }
       
        cycleSwap(array);

        System.out.println("Результат зсуву на 1 позицію:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        cycleSwap(array, shift);

        System.out.println("\nРезультат зсуву на " + shift + " позиції(й): ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
  
    }

    public static void cycleSwap(int[] array) {
        int lastElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
    }

   
    public static void cycleSwap(int[] array, int shift) {
        for (int j = 0; j < shift-1; j++) {
         cycleSwap(array);
        }
    }
}