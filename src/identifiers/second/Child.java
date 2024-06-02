package src.identifiers.second;

import src.identifiers.first.Parent;

public class Child extends Parent{
    //klasa potomna w innej paczce nie ma dostepu do pol/metod private oraz default tzw. package
    public void testIndetifier() {
        System.out.println(first); //public
        //System.out.println(second); //default - tez nie ma dostepu
        System.out.println(third); //protected
        //System.out.println(fourth); //nie mamy dostepu do pola prywatnego
        firstMethod();
        //secondMethod();
        thirdMethod();
        //fourthMethod();
    }
}
