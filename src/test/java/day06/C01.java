package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C01 {
    //assert equal true false bir methodu cagırmak ıcin obje olmadan
    //class isminı yazarak ulasabilriz
    //assert ile methodlar statıc tır
    //asserttrue=buranındatrueolmasını ıster
    //assertfalse=icerirninfalseolmasını ıster
//    alt alta 5tane assert var biri failed olsa
//    test calısmayı durdurur
//  /*soru

    static WebDriver driver;
    @Before
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.bestbuy.com/");
    }
    @Test
    public void urlTest(){
        String expectedURL="https://www.testing.com/";
   String actualURL=driver.getCurrentUrl();
        Assert.assertEquals("ıstenen url yok",expectedURL,actualURL);
    }
    @Test
public void titleTest() {
        String istenmeyenKelime = "Best";
        String actualTitle = driver.getTitle();

        Assert.assertFalse("istenmeyen kelime titlede var", actualTitle.contains(istenmeyenKelime));
    }
    @Test
        public void logoTest(){
    WebElement logo= driver.findElement(By.xpath("//"));

    }

    @Ignore
    public static  void tearDown(){
        driver.close();
    }
}
