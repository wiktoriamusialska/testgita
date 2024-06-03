package src;

public interface Vehicle { //zestaw metod bez implementacji, zwracamy typ bez ciala metody - bez kodu
    void jazda(int speed); //domyslnie publiczne sa metody w interfejsie
    void stop();
    String info();


}
