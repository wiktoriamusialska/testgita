package src;

public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age); //wywola konstuktor klasy nadrzednej
        System.out.println("Jestem w konstruktorze Footballer");
        this.footballClub=footballClub;
    }
    public void eat() { //ta metoda nadpisze metode z person
        System.out.println(" I like heathly food");
    }

    public void playFootball() {
        eat();
        walk();
        System.out.println("I am playing football for "+ footballClub);
    }

}
