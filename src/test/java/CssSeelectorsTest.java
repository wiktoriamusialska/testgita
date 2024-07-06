import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSeelectorsTest {
    @Test
    public void findElements() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        //id
        By cssId = By.cssSelector("#clickOnMe");
        driver.findElement(cssId);

        //class
        By cssClass = By.cssSelector(".topSecret");
        driver.findElement(cssClass);

        //tag
        driver.findElement(By.cssSelector("input")).sendKeys("Pierwszy");

        //name
        driver.findElement(By.cssSelector("[name='fname']"));

        //class-inna metoda
        driver.findElement(By.cssSelector("[class='topSecret']"));

        //all
        driver.findElement(By.cssSelector("*"));

        // div ul - w zagniezdzeniach tez szukamy
        driver.findElement(By.cssSelector("div ul"));

        //table tr - w zagniezdzeniach tez szukamy
        driver.findElement(By.cssSelector("table tr"));

        //tbody tr
        driver.findElement(By.cssSelector("tbody tr"));

        //pierwsze dziecko ul dla div znacznika
        driver.findElement(By.cssSelector("div > ul"));

        //pierwsze dziecko ul dla div znacznika
        driver.findElement(By.cssSelector("tbody > tr"));

        //pierwszy element
        driver.findElement(By.cssSelector("label + form"));

        //wszystkie elementy
        driver.findElement(By.cssSelector("label ~ form"));

        //input name
        driver.findElement(By.cssSelector("input[name='fname']"));

        //wszystkie name zawierajce name
        driver.findElement(By.cssSelector("[name*='name']"));

        //wszystkie name zaczynajace sie od
        driver.findElement(By.cssSelector("[name^='f']"));

        //wszystkie name konczace sie na
        driver.findElement(By.cssSelector("[name$='name']"));

        //zle praktyki - ale warto wiedziec
        driver.findElement(By.cssSelector("li:first-child")); //pierwsze dziecko
        driver.findElement(By.cssSelector("li:last-child")); //ostatnie dziecko
        driver.findElement(By.cssSelector("li:nth-child(3)"));//numerujemy od 1, 3 dziecko


    }
}
