package src;

public class Dom {

    public String drzewa;
    public String kwiaty;
    public String warzywa;
    public String owoce;

   public Dom(String drzewa, String kwiaty, String warzywa, String owoce){
        this.drzewa=drzewa;
        this.kwiaty=kwiaty;
        this.warzywa=warzywa;
        this.owoce=owoce;
    }

    public void rosnij(){
        System.out.println("Rośnijcie moje uprawy");
    }
    public void podlej(){
        System.out.println("Trzeba podlewać, bo dawno nie padało");
    }
    public void wyrwij(){
        System.out.println("Ale chwasty urosły, czas je wyrwać");
    }
}
