package src;

public class ConversionCasting {
    public static void main(String[] args) {

        int a =2;
        double b = 4.23;

        double c= a/b; //a zostae przekonwertowana na double
        int d=a/(int) b; //rzutujemy - chcemy przeknwertowac recznie

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();
        FirefoxDriver firefoxDriver = (FirefoxDriver) driver; //rzutujemy na firefox
        firefoxDriver.get();
    }
}
