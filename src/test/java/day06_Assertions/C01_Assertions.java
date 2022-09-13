package day06_Assertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C01 {

    /*
    1) Bir class oluşturun: BestBuyAssertions
    2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak asagidaki testleri yapin
    ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
    ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    ○ logoTest => BestBuy logosunun görüntülendigini test edin
    ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
     */

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(" https://www.bestbuy.com/");
    }

    @After
    public void tearDown(){
        driver.close();
    }

    //○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
    @Test
    public void testURL(){
        driver.getCurrentUrl()
    }

}
