package src.identifiers.first;

public class Child extends Parent{

    //klasa potomna w tej samej paczce nie ma dostepu do pol/metod private
    public void testIndetifier() {
        System.out.println(first); //public
        System.out.println(second); //default
        System.out.println(third); //protected
        //System.out.println(fourth); //nie mamy dostepu do pola prywatnego
        firstMethod();
        secondMethod();
        thirdMethod();
        //fourthMethod();
    }
}
