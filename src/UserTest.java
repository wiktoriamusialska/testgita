package src;

public class UserTest {
    public static void main(String[] args) {

        User user = new User("Wiktoria", "qwerty");
        //user.username = "Wiktoria";
        //user.password = "qwerty";
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
