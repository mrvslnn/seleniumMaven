package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C02_Test01 {
    public static void main(String[] args) {


//    1-Test01 isimli bir class olusturun
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//2- https://www.walmart.com/ adresine gidin
        driver.get("http://www.walmart.com");
//3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
//4-Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Save” ifadesi icerdigini control edin
String actualTıtle= driver.getTitle();
String kelime="Save";
if (actualTıtle.contains(kelime)){
    System.out.println("iceriyor passed");
}else{
    System.out.println("icermiyor failed");
}
//6-Sayfa basliginin “Walmart.com | Save Money.Live Better” a esit oldugunu control ediniz
String expectedTıtle="Walmart.com | Save Money.Live Better";
if (actualTıtle.equals(expectedTıtle)){
    System.out.println("tıtle beklene ile ayı");
}else{
    System.out.println("tıtle beklenen ile aynı degil");
}
//7- URL in walmart.com icerdigini control edin
String actualURL= driver.getCurrentUrl();
String expectedURL="walmart.com";
if (actualURL.contains(expectedURL)){
    System.out.println("url walmart.com iceiryor");
}else{
    System.out.println("url walmart.com icermiyor");
}
//8-”Nutella” icin arama yapiniz
        WebElement aramaBox= driver.findElement(By.xpath("//input[@name='q']"));
aramaBox.sendKeys("nutella"+ Keys.ENTER);

//9- Kac sonuc bulundugunu yaziniz
        WebElement sonucBox= driver.findElement(By.xpath("//div[@class='inline-flex mv3-xl mt3 ml3 ml4-xl mr1 db']"));
        System.out.println(sonucBox.getText());
        //10-Sayfayi kapatin
        driver.close();
    }
}