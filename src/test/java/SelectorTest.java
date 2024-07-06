import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorTest {

    @Test
    public void findElements() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        //clickOnMe
        By buttonId = By.id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonId);

        //fname
        //By firstName = By.name("fname");
        //WebElement firstNameInput = driver.findElement(firstName);
        driver.findElement(By.name("fname"));

        //hidden
        driver.findElement(By.className("topSecret"));

        //tag
        driver.findElement(By.tagName("input"));

        //tags
        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("Pierwszy");
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        System.out.println(inputs.size());

        //link
        By linkText = By.linkText("Visit W3Schools.com!");
        WebElement schoolLink = driver.findElement(linkText);

        //partialLinkText
        By partialLink = By.partialLinkText("Visit");
        WebElement schoolPartial = driver.findElement(partialLink);



    }
}
