package src;

public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue =false;
        boolean thirdValue =false;
        boolean fourthValue = true;

        // & true wtedy kiedy wyrazenia skladowe sa rowne true
        System.out.println(firstValue && secondValue); //false
        System.out.println(firstValue && fourthValue); //true
        System.out.println(secondValue && thirdValue); //false

        // || true gdy jedno z wyrazen skladowych jest rowne true
        System.out.println(firstValue || secondValue); //true
        System.out.println(firstValue || fourthValue); //true
        System.out.println(secondValue || thirdValue); //false

        // ! negacja zwraca wartość przeciwna do wyrażenia przed którym się znajduje
        System.out.println(!firstValue); //false
        System.out.println(!thirdValue); //true
        System.out.println(!(firstValue && secondValue)); //true

    }
}
