package src;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        System.out.println("Hej, ile masz lat? ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Przykro mi, jesteś niepełnoletni, nie możesz kupić alkoholu");
        }  else {
            System.out.println("Dziękujemy na zakupy w naszym sklepie");
        }
    }
}
