import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class XpathTest {

    @Test
    public void findElements() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        //clickOnMe
        By buttonId = By.xpath("//button[@id='clickOnMe']");
        WebElement clickOnMeButton = driver.findElement(buttonId);

        //fname
        //By firstName = By.name("fname");
        //WebElement firstNameInput = driver.findElement(firstName);
        driver.findElement(By.xpath("//input[@name='fname']"));

        //hidden
        driver.findElement(By.xpath("//p[@class='topSecret']"));

        //tag
        driver.findElement(By.xpath("//input"));

        //tags
        WebElement input = driver.findElement(By.xpath("//input"));
        input.sendKeys("Pierwszy");
        List<WebElement> inputs = driver.findElements(By.xpath("//input"));
        System.out.println(inputs.size());

        //link
        By linkText = By.xpath("//a[text()='Visit W3Schools.com!']");
        WebElement schoolLink = driver.findElement(linkText);

        //partialLinkText
        By partialLink = By.xpath("//a[contains(text(),'Visit')]");
        WebElement schoolPartial = driver.findElement(partialLink);

        //xpath PART
        By fullPath = By.xpath("/html/body/div/ul");
        driver.findElement(fullPath);

        By shortPath = By.xpath("//ul");
        driver.findElement(shortPath);

        By allXpath = By.xpath("//*"); //wszystkie tagi
        driver.findElement(allXpath);

        By secondElement = By.xpath("//input[2]");
        driver.findElement(secondElement);

        By lastElement = By.xpath("//input[last()]");
        driver.findElement(lastElement);

        By elementWithAttribute = By.xpath("//*[@name]");
        driver.findElement(elementWithAttribute);

        By attrEq = By.xpath("//button[@id='clickOnMe']");
        By attrNotEq = By.xpath("//*[@id!='clickOnMe']");
        By attrCont = By.xpath("//*[contains(@name,'ame')]");
        By startWith = By.xpath("//*[starts-with(@name,'user')]");
        By endsWith = By.xpath("//*[substring(@name, string-length(@name)-string-length('name')+1)='name']");
        driver.findElement(attrEq);
        driver.findElement(attrNotEq);
        driver.findElement(attrCont);
        driver.findElement(startWith);
        driver.findElement(endsWith);

        //ul- tworzy liste

        By child = By.xpath("//div/child::ul"); //szuka dziecka div ktore jest ul
        By desc = By.xpath("//div/descendant::ul"); //szukamy wszystkich zstepnych div, ktore sa ul
        By parent = By.xpath("//div/../.."); //bezposredni tag w html - rodzic - im wiecej zagniezdzen tym bardziej idziemy w gore
        By asc =By.xpath("//div/ancestor::*"); //wszystkie tagi nad naszym - nadrzedne - zstepne
        By foll = By.xpath("//img/following::*"); //wszystkie tagi po naszym obrazku
        By follSib = By.xpath("//img/following-sibling::*"); //następujące ale na tym samym poziomie co obrazek
        By prec = By.xpath("//img/preceding::*");
        By precSibl=By.xpath("//img/preceding-sibling::*");

        driver.findElement(child);
        driver.findElement(desc);
        driver.findElement(parent);
        driver.findElement(asc);
        driver.findElement(foll);
        driver.findElement(follSib);
        driver.findElement(prec);
        driver.findElement(precSibl);

        //wyszukanie divow i linkow:
        By divsAndLinks = By.xpath("//a | //div");

        //wyszukanie inputu ktorego name=fanme i id = fname:
        By andOp = By.xpath("//input[@name='fname' and @id='fname']");

        //wyszukanie inputu ktorego name=fanme lub id = fname:
        By orOp = By.xpath("//input[@name='fname' or @id='fname']");

        driver.findElement(divsAndLinks);
        driver.findElement(andOp);
        driver.findElement(orOp);





    }
}
