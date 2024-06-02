package src;

public class DomTest {
    public static void main(String[] args) {
        Ogrod ogrod = new Ogrod("lipę", "różę", "Pomidor", "Borówka");
        Warzywnik warzywnik= new Warzywnik("Brzoza", "Tulipan", "ogórka", "truskawek");

        ogrod.rosnij();
        ogrod.podlej();
        ogrod.wyrwij();
        ogrod.przytnij();
        ogrod.zasadz();

        warzywnik.rosnij();
        warzywnik.podlej();
        warzywnik.wyrwij();
        warzywnik.nawiez();
        warzywnik.zbierz();

    }
}
