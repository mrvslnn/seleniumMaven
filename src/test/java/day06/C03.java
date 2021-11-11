package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C03 {
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
        public void mert(){

        }
    @AfterClass
    public static void tearDown() {
        driver.close();
    }
    }
