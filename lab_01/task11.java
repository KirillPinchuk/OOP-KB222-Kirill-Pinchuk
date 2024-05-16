package lab_01;
import java.util.Scanner;

public class task11 {
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

        int result = sum(array);
        System.out.println("Максимальне значення: " + result);
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}