package src;

public class Hobby {

    public int liczbaKsiazek;
    public int liczbaSeriali;

    public String tytulKsiazki;

    public String tytulSerialu;

    public Hobby(int liczbaKsiazek, int liczbaSeriali, String tytulKsiazki, String tytulSerialu){
        this.liczbaKsiazek=liczbaKsiazek;
        this.liczbaSeriali=liczbaSeriali;
        this.tytulKsiazki=tytulKsiazki;
        this.tytulSerialu=tytulSerialu;
    }

    public void czytalam(){
        System.out.println("Ostatnio czytalam " + tytulKsiazki);
    }
    public void ogladalam(){
        System.out.println("Ostatnio ogladalam "+ tytulSerialu);
    }
}
