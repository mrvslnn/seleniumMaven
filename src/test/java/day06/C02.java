package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C02 {
    static WebDriver driver;

    @Before
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com/");
        driver.findElement(By.xpath("//*[text()='I Agree']")).click();

    }

    @Test
    public void titleTest() {
String expectedTitle="YouTube";
String actualTitle= driver.getTitle();
        Assert.assertEquals("istenen title belenenden farklı",expectedTitle,actualTitle);
    }
@Test
public void imgTest(){
    WebElement logo=driver.findElement(By.xpath("//yt-icon[@id='logo-icon'])[1]"));
    Assert.assertTrue("logo gorunmuyor", logo.isDisplayed());
}
@Test
public void sourceBox(){
        WebElement box= driver.findElement(By.id("seach-input"));
Assert.assertTrue("arama kutusuna ulasılamıyor", box.isDisplayed());
    }
@Test
public void yanlisTiitle(){
        String istenmeyenTitle="youtube";
        String actualTitle= driver.getTitle();
        Assert.assertFalse(istenmeyenTitle.equals(actualTitle));
}
    @AfterClass
    public static void tearDown() {
driver.close();
    }
}