package src;

public class ReadOnly {
    private String name ="Bartek";
    /*public String getName(){
        return name + "jest ok";
    } //zwraca pola prywatne - do odczytu

    public void setName(String name) { //mozna konfigurowac pole prywatne// , ale nie pobrac ani modyfikowac //przypisanie wartosci tez
        this.name=name;
    } */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
