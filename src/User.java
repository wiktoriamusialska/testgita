package src;

public class User {
    public String username;
    public String password;

    //metoda wywlowywana dla każdego usera domyslnie po inicjalizacji
    public User(String username, String password) {
        System.out.println("Hello z konstruktora");
        this.username=username; //pole nowo utworzonego obiektu
        this.password=password;
    }
    public void sayHello(){
        System.out.println("Hello my name is : "+username);
    }
}
