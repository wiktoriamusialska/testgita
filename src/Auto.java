package src;

public class Auto {

    public String marka;
    public String model;
    public Integer rok;
    public Integer przebieg;
    public Auto(String marka, String model, int rok, int przebieg) {
        System.out.println("Hello z samochodu");
        this.marka=marka; //pole nowo utworzonego obiektu
        this.model=model;
        this.rok=rok;
        this.przebieg=przebieg;
    }
    public void jedz(){
        System.out.println("Jedź!");
    }
    public void hamuj(){
        System.out.println("Hamuj!");
    }
    public void info(){
        System.out.println("Marka " + marka);
        System.out.println("Model " + model);
        System.out.println("Rok produkcji " + rok);
        System.out.println("Przebieg "+ przebieg);
    }
}
