package src;

public class Calculator {
    public int addition(int firstNumber, int secondNumber) {
        System.out.println("Suma to: "+(firstNumber+secondNumber));
        return firstNumber+secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        System.out.println("Różnica to: "+(firstNumber-secondNumber));
        return firstNumber-secondNumber;
    }
    public int multiplication(int firstNumber, int secondNumber) {
        System.out.println("Iloczyn: "+(firstNumber*secondNumber));
        return firstNumber*secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        System.out.println("Iloraz to: "+(firstNumber/secondNumber));
        return firstNumber/secondNumber;
    }

    public int mod(int firstNumber, int secondNumber) {
        System.out.println("Modulo to: "+(firstNumber%secondNumber));
        return firstNumber%secondNumber;
    }
}
