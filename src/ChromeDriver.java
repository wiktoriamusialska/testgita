package src;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Uzywam Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znalazłam ten element za pomocą przeglądarki Chrome");

    }
}
