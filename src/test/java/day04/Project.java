package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Project {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.jotform.com/build/212804571037350");
        WebElement name1=driver.findElement(By.name("q3_ad[first]"));
        name1.sendKeys("merve");
        WebElement surname=driver.findElement(By.name("q3_ad[last]"));
        surname.sendKeys("aslan");
       // driver.findElement(By.xpath("//*[@id=\"input_4\"))
        driver.findElement(By.cssSelector("#input_8_area")).sendKeys("+98");
        WebElement telNo=driver.findElement(By.xpath("//input[@name='q8_isTelefonu[phone]'"));
        telNo.sendKeys("05553053756");
        driver.findElement(By.xpath("//input[@id='input_5']")).sendKeys("Techpro");
       WebElement country= driver.findElement(By.xpath("//select[@id='input_7_country']"));
country.click();
country.sendKeys("Andorra");
country.click();
driver.findElement(By.name("q6_firmaWebsitesi")).sendKeys("gezginler.com");
driver.findElement(By.xpath("//*//*[@id=\"input_2\"]")).submit();


    }
}
