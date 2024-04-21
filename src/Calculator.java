package src;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        //System.out.println(firstNumber);
        System.out.println("Proszę podaj drugą liczbę");
        int secondNumber = scanner.nextInt();
        //System.out.println(secondNumber);

        int addition=firstNumber+secondNumber;
        int subtraction =firstNumber-secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = firstNumber/secondNumber;
        float mod = secondNumber%firstNumber;

        System.out.println("Dodawanie: "+addition);
        System.out.println("Odejmowanie: "+subtraction);
        System.out.println("Mnożenie: "+multiplication);
        System.out.println("Dzielenie: "+division);
        System.out.println("Modulo: "+mod);
    }


}
