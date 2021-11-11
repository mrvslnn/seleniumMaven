package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class C01_Maven {
    public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//amazon sayfasına gidin
        driver.get("https://www.amazon.com");
        //arama kutusunu locate edelim
WebElement aramaBox= driver.findElement(By.id("twotabsearchtextbox"));
        //samsung headphones ile arama yapalım
        aramaBox.sendKeys("samsung headphones" + Keys.ENTER);

        //bulunan sonuc sayısını yazdıralım
WebElement sonucYazısıElementi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
       //by classname ile locate ettıgıız webelementinde class attribute unun degerinde bosluk vrasa locater saglıklı caslısmayablır
        System.out.println(sonucYazısıElementi.getText());
        //ilk urunu tıklayalım
//WebElement ilkUrun= driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
//ilkUrun.click();
//sadece click yapacaksak webelement olusturmaya ve assign etmeye gerek yok
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
//sayfadaki tum baslıkları yazdıralım
        driver.navigate().back();
        List<WebElement> urunler=driver.findElements(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])"));
        for (WebElement each: urunler ) {
            System.out.println(each.getText());
        }

    }
}
