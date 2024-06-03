package src;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Uzywam Firefoxa");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znalazłam ten element za pomocą Firefoxa");

    }
}
