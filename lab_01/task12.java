package lab_01;
import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введіть кількість елементів масиву: ");
        int size = console.nextInt();
        while (size <= 1) {
            System.out.println("Кількість елементів масиву повинна бути більше нуля.");
            System.out.print("Введіть кількість елементів масиву: ");
            size = console.nextInt();
        }
        
        int[] array = new int[size];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            array[i] = console.nextInt();
        }

        boolean[] result = getSumCheckArray(array);
        System.out.print("Результат: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] result = new boolean[array.length];
        if (array.length >= 3) {
            for (int i = 2; i < array.length; i++) {
                result[i] = array[i] == array[i - 1] + array[i - 2];
            }
        }
        return result;
    }
}