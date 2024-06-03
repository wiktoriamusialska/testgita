package src;

public class WebDriverTes {
    public static void main(String[] args) {
        WebDriver driver = getDriver("chrome123");
        driver.get();
        driver.findElementBy();
    }

    private static WebDriver getDriver(String chrome){
    if (chrome.equals("chrome")){
        return new ChromeDriver();
    } else if (chrome.equals("firefox")){
        return new FirefoxDriver();
    }
    throw new NoValidBrowserName("No valid browser name");
    }
}
