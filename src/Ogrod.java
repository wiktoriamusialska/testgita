package src;

public class Ogrod extends Dom{

    public Ogrod(String drzewa, String kwiaty, String warzywa, String owoce) {
        super(drzewa, kwiaty, warzywa, owoce);
    }

 public void zasadz(){
     System.out.println("Trzeba zasadzic " + drzewa );
 }
 public void przytnij() {
     System.out.println("Czas przyciac " + kwiaty);
 }
}
