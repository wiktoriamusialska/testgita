package src;

public class SStundetTest {
    public static void main(String[] args) {
        SStundent it = new ItStudent();
        sayHello("John", it, 21); //implementacja interfejsu

        SStundent med = new SStundent() { //nowy obiekt interfejsu - klasa anonimowa
            @Override
            public void sayHello(String name, int age) {
                System.out.println(" I will be a doctor");
                System.out.println("My name is " + name );
            }
        };
        sayHello("Kate", med, 31);
        //parametr -> System.out.println(" I am not a student, My name is " + name );
        //(par1, par2) -> cos - przyklad dla dwoch parametrow
        //1 linijka lambda
        //SStundent noStudent = (name, age) -> System.out.println(" I am not a student, My name is " + name + " I'm "+ age); //lambda

        //kilka linijek w lambdzie
        SStundent noStudent = (name, age) -> {
            System.out.println(" I am not a student, My name is " + name + " I'm "+ age);
            if (age > 18){
                System.out.println("You can buy a beer");
            }
        };
        sayHello("Tom", noStudent, 44); //uruchomiamy metode dla studenta - klasa anonimowa z lambda zamiast override , krocej, szybciej, alternatywa
    }

    public static void sayHello (String name, SStundent sStudent, int age){
        sStudent.sayHello(name, age);
    }
}
