package src;

public class Company {
    public String personName;

    public String personSurname;
    public Company (String personName, String personSurname){
        System.out.println("Pracownik nazywa się " + personName);
        this.personName=personName;
        this.personSurname=personSurname;
    }

    public void money(){
        System.out.println("Moje nazwisko to: " + personSurname);
        System.out.println("I work for a money");
    }
    public void hobby(){
        System.out.println("I like my current job position");
    }
}
