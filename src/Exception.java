package src;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) throws InvalidAgeException {
        System.out.println("Hej, ile masz lat? ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18 ) {
            System.out.println("Jesteś pełnoletni");
        }
        else if (age < 0) {throw new InvalidAgeException("Invalid Age Exception");}

        }
    }
