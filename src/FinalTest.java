package src;

public class FinalTest {
    public static void main(String[] args) {
        final int x = 2; //nie mozna zmienic wartosci takiej zmiennej
        final Person person = new Person("Tim",26);
        person.age=25; //mozna modyfukowac obiekty //nowego obiektu nie mozemy przypisac


    }
}
