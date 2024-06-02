package src.identifiers.first;

public class Parent {

    //cztery modyfikatory dostepu - zmienne
    public String first = "public";
    String second = "default";
    protected String third ="protected";
    private String fourth = "private";
    // cztery metody

    public void firstMethod() {
        System.out.println("public");

    }
    void secondMethod() {
        System.out.println("default");

    }
    protected void thirdMethod() { //void czyli nic nie zwraca
        System.out.println("protected");

    }
    private void fourthMethod() {
        System.out.println("private");

    }

public void testIdentifiers(){
    System.out.println(first);
    System.out.println(second);
    System.out.println(third);
    System.out.println(fourth);
    firstMethod();
    secondMethod();
    thirdMethod();
    fourthMethod();
}
}
