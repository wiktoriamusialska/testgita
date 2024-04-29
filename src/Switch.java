package src;

public class Switch {
    public static void main(String[] args) {
        String danie ="zurek";
        switch(danie) {
            case "pizza":
                System.out.println("Cena to 22zl");
                break;
            case "łosoś":
                System.out.println("Cena to 30zl");
                break;
            case "frytki":
                System.out.println("Cena to 9zl");
                break;
            default:
                System.out.println("Brak dania w karcie");
        }
    }
}
