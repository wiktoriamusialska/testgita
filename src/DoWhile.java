package src;

public class DoWhile {
    public static void main(String[] args) {
        int number =21;
       do {
           System.out.println("Moja wartość "+ number + " i jestem mniejsza od 20");
           number++;
        }  while (number < 20); //wykonujemy kod nawet jak warunek nie jest spelniony, wazne!
    }
}
