package lab_01;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введіть кількість елементів масиву: ");
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

        int maxValue = max(array);
        System.out.println("Максимальне значення: " + maxValue);
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}