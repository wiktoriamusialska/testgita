package src.identifiers.second;

import src.identifiers.first.Parent;

public class Random {
    //klasa w innej paczce nie ma dostepu do pol/metody private, default, protected
    public void testIndetifier() {
        Parent parent = new Parent();
        System.out.println(parent.first);
        //System.out.println(parent.second); //nie mamy dostepu do default
        //System.out.println(parent.third); //nie mamy dostepu do protected
        //System.out.println(parent.fourth); //nie mamy dostepu do prywatnych
        parent.firstMethod();
        //parent.secondMethod();
        //parent.thirdMethod();
        //fourthMethod();
    }
}
