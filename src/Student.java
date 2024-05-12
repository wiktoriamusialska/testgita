package src;

public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;
//wspoldzielona metoda dla elementow/obiektow wewnatrz klasy
    public static String nazwaUczelni= "AGH po zmianie";
    public void przedstawSie() {
        System.out.println("Nazywam się "+ imie + " " + nazwisko);
    }
    public void zalogujSie(){
        System.out.println("Zaloguj sie za pomoca " + nick);
    }
    public void podajNumerIndeksu(){
        System.out.println("Moj numer indeksu to: "+numerIndeksu);
    }
    public void podajEmail(){
        System.out.println("Moj email to: "+email);
    }
    public static void infoUczelnia() {
        System.out.println("Moja uczelnia to: " + nazwaUczelni);
        druga(); //mozna uzywac metod statycznych w metodach statycznych
    }
    public static void druga(){
        System.out.println("Jestem drugą metodą");
    }
}
