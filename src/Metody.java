package src;

public class Metody {
 public void policzWynik(){ //nie zwraca wartosci ta metoda
     System.out.println("Zaraz policze wynik");
     int result=0;
     for ( int i=0; i<100; i++){
         result=result+i;
     }
     System.out.println("Rezultat to: "+result);
 }
    public int pobierzWynik(){ //nie zwraca wartosci ta metoda
        System.out.println("Zaraz policze wynik");
        int result=0;
        for ( int i=0; i<100; i++){
            result=result+i;
        }
        System.out.println("Rezultat to: "+result);
        return result;
    }
    public void policzWynikParam(int number){ //nie zwraca wartosci ta metoda
        System.out.println("Number ma wartość: "+number);
        System.out.println("Zaraz policze wynik");
        int result=0;
        for ( int i=0; i<number; i++){
            result=result+i;
        }
        System.out.println("Rezultat to: "+result);
    }

    public int add(int firstNumber, int secondNumber, String word) {
        System.out.println("Suma to: "+(firstNumber+secondNumber));
        if (firstNumber==0){
            return 0;
        }
        return firstNumber+secondNumber;
    }
}
