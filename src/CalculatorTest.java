package src;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        //System.out.println(firstNumber);
        System.out.println("Proszę podaj drugą liczbę");
        int secondNumber = scanner.nextInt();
        //System.out.println(secondNumber);
        Calculator calculator = new Calculator();
        //int addition=firstNumber+secondNumber;
        int addition = calculator.addition(firstNumber,secondNumber);
        //int subtraction =firstNumber-secondNumber;
        int subtraction = calculator.subtraction(firstNumber,secondNumber);
        //int multiplication = firstNumber * secondNumber;
        int multiplication = calculator.multiplication(firstNumber,secondNumber);
        //float division = firstNumber/secondNumber;
        int division = calculator.division(firstNumber,secondNumber);
        //float mod = secondNumber%firstNumber;
        int mod = calculator.mod(firstNumber,secondNumber);

        /*System.out.println("Dodawanie: "+addition);
        System.out.println("Odejmowanie: "+subtraction);
        System.out.println("Mnożenie: "+multiplication);
        System.out.println("Dzielenie: "+division);
        System.out.println("Modulo: "+mod);*/
    }


}
