package src;
//czym sie rozni interfejs od klasy abstrakcyjnej
public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        Animal cat = new Cat();
        cat.sound();
    }
}
