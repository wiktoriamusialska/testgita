package src;

public class WebDriverSecondTest { //klasy abstrakcyjne
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();
        WebDriver firefox = new FirefoxDriver();
        WebDriver firefoxSecond = new FirefoxDriver();
        WebDriver firefoxThird = new FirefoxDriver();

        WebDriver safari = new WebDriver() { //abstrakcyjna - nazwa klasy ktora mamy implementowac, msi zdefiniowac body
            @Override
            public void get() {
                System.out.println("Opening page with Safari");

            }

            @Override
            public void findElementBy() {
                System.out.println("Finding element with Safari");
            }
        };
        //mozemy reużywać tego
        safari.get();
        safari.findElementBy();
    }
}
