package src;

public class Ogladanie extends Hobby{
    public Ogladanie(int liczbaKsiazek, int liczbaSeriali, String tytulKsiazki, String tytulSerialu) {
        super(liczbaKsiazek, liczbaSeriali, tytulKsiazki, tytulSerialu);
    }

    public void wypisz(){
        System.out.println("Serial: " + tytulSerialu +  " liczba obejrzanych seriali: " + liczbaSeriali );
        System.out.println("Ksiazka: " + tytulKsiazki +  " liczba przeczytanych ksiazek: " + liczbaKsiazek );
    }
}
