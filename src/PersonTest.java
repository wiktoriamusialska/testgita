package src;

public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 33, "UMK"); //obiekt klasy
        //teacher.name="Tom";
        //teacher.age= 33;
        //teacher.school = "UMK";
        teacher.walk();
        teacher.eat();
        teacher.teachMath();
        teacher.sayHello();


        Footballer footballer = new Footballer("Mike", 22, "Twarde Pierniki");
        //footballer.name = "Mike";
        //footballer.age = 22;
        footballer.walk();
        footballer.eat();
        //footballer.footballClub = "Twarde Pierniki";
        footballer.playFootball();

    }
}
