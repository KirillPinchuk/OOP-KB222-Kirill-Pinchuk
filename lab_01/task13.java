package lab_01;
import java.util.Scanner;
import java.util.Arrays;

public class task13 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введіть кількість елементів масиву: ");
        int size = console.nextInt();
        while (size <= 0) {
            System.out.println("Кількість елементів масиву повинна бути більше нуля.");
            System.out.print("Введіть кількість елементів масиву: ");
            size = console.nextInt();
        }
        
        int[] Array = new int[size];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            Array[i] = console.nextInt();
        }

        int[] result = removeLocalMaxima(Array);
        System.out.println("Результат: " + Arrays.toString(result));
    }

    public static int[] removeLocalMaxima(int[] Array) {
        int[] resultArray = Arrays.copyOf(Array, Array.length);

        for (int i = 1; i < Array.length - 1; i++) {
            if (Array[i] > Array[i - 1] && Array[i] > Array[i + 1]) {
                resultArray = removeElement(resultArray, i);
            }
        }

        if (Array.length > 1 && Array[0] > Array[1]) {
            resultArray = removeElement(resultArray, 0);
        }

        if (Array.length > 1 && Array[Array.length - 1] > Array[Array.length - 2]) {
            resultArray = removeElement(resultArray, resultArray.length - 1);
        }

        return resultArray;
    }

    public static int[] removeElement(int[] Array, int index) {
        int[] newArray = new int[Array.length - 1];
        System.arraycopy(Array, 0, newArray, 0, index);
        System.arraycopy(Array, index + 1, newArray, index, Array.length - index - 1);
        return newArray;
    }
}