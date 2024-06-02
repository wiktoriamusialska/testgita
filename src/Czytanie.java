package src;

public class Czytanie extends Hobby{
    public Czytanie(int liczbaKsiazek, int liczbaSeriali, String tytulKsiazki, String tytulSerialu) {
        super(liczbaKsiazek, liczbaSeriali, tytulKsiazki, tytulSerialu);
    }

    public void zlicz() {
        System.out.println("Łączna liczba seriali i filmów to: " + (liczbaKsiazek+liczbaSeriali));
    }
}
