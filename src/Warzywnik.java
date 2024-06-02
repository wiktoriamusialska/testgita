package src;

public class Warzywnik extends Dom{
    public Warzywnik(String drzewa, String kwiaty, String warzywa, String owoce) {
        super(drzewa, kwiaty, warzywa, owoce);
    }

    public void nawiez() {
        System.out.println("Potrzeba użyc nawozu pod " + warzywa );
    }
    public void zbierz(){
        System.out.println("Czas na zbiory " + owoce);
    }
}
