package lab_01;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Слово :");
        String input = console.nextLine();
        System.out.println("Hello, " + input);
        console.close();
    }
}