package src.identifiers.first;

public class Random {

    //klasa w tej samej paczce nie ma dostepu do pol/metody private
    public void testIndetifier() {
        Parent parent = new Parent();
        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);
        //System.out.println(parent.fourth); //nie mamy dostepu
        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();
        //fourthMethod();
    }
}
