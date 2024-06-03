package src;

public class ExeptionExample {
    /*public static void main(String[] args) {
        int[] numbers = new int[2];
        numbers[0]=1;
        numbers[1]=3;

        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }*/
    public static void main(String[] args) {

        WebDriver driver = getDriver("chrome");
        driver.get();
        driver.findElementBy();
    }
    private static WebDriver getDriver(String chrome) {
        if (chrome.equals("chrome")){
            return new ChromeDriver();
        } else if (chrome.equals("firefox")){
            return new FirefoxDriver();
        }
        return null;
    }
}
