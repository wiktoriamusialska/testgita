import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class BasicActionTest {
    @Test
    public void peformAction(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");

        WebElement basicPageLink = driver.findElement(By.linkText("Podstawowa strona testowa"));
        System.out.println(basicPageLink.getText());
        basicPageLink.click();
        //driver.findElement(By.id("clickOnMe")).click();
        //driver.findElement(By.id("fname")).click();
        driver.findElement(By.id("fname")).sendKeys("Wiktoria");
        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.clear();
        usernameInput.sendKeys("admin");
        //usernameInput.sendKeys(Keys.ENTER); //nacisniecie ENTER
        usernameInput.sendKeys(Keys.TAB); //nacisniecie TAB
        //checkbox i radiobutton
        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        driver.findElement(By.cssSelector("[value='male']")).click();
        //dropdown
        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCar);
        //cars.selectByIndex(2); //numerujemy od 0 -po indeksie
        //cars.selectByVisibleText("Audi"); //po tekscie
        cars.selectByValue("volvo"); //po wartosci
        //pobieranie wartosci z selecta
        List<WebElement> options = cars.getOptions();
        for (WebElement option:options){
            System.out.println(option.getText());
        }

        Homework home = new Homework();
        System.out.println(home.check("Audi", selectCar));
        System.out.println(home.check("Jeep", selectCar));



    }
}
