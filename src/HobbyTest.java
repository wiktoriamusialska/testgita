package src;

public class HobbyTest {
    public static void main(String[] args) {
        Czytanie  czytanie = new Czytanie(2, 3, "Chłopki", "W garniturach");
        Ogladanie ogladanie = new Ogladanie(3, 6, "Arabska saga", "Dark");

        czytanie.czytalam();
        czytanie.ogladalam();
        czytanie.zlicz();
        ogladanie.czytalam();
        ogladanie.ogladalam();
        ogladanie.wypisz();
    }
}
