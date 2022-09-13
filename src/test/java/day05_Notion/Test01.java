package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Test01 {

    /*
    1-Test01 isimli bir class olusturun
    2- https://www.amazon.com/ adresine gidin
    3- Browseri tam sayfa yapin
    4-Sayfayi “refresh” yapin
    5- Sayfa basliginin “Amazon” ifadesi icerdigini control edin
    6-Sayfa basliginin “Amazon.com. Spend less. Smile more.” a esit oldugunu control ediniz
    7- URL in amazon.com icerdigini control edin
    8-”Nutella” icin arama yapiniz
    9- Kac sonuc bulundugunu yaziniz
    10-Sayfayi kapatin
     */

    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        driver.navigate().refresh();
    }

    //5- Sayfa basliginin “Amazon” ifadesi icerdigini control edin
    @Test
    public void titleTest(){
       String actualTitle = driver.getTitle();
       String exceptedTitle = "Amazon";
       if (actualTitle.contains(exceptedTitle)){
           System.out.println("Title Test PASSED");
       }else {
           System.out.println("Title Test FAILED, actual title : "+actualTitle);
       }
    }

    //6-Sayfa basliginin “Amazon.com. Spend less. Smile more.” a esit oldugunu control ediniz
    @Test
    public void fullTitle(){
        String actualFullTitle = driver.getTitle();
        String exceptedFullTitle = "Amazon.com. Spend less. Smile more.";
        if (actualFullTitle.equals(exceptedFullTitle)){
            System.out.println("Title Test PASSED");
        }else {
            System.out.println("Title Test FAILED, actual title : "+actualFullTitle);
        }
    }

    //7- URL in amazon.com icerdigini control edin
    @Test
    public void urlTest(){
        String actualURL = driver.getCurrentUrl();
        String exceptedURL = "amazon.com";
        if (actualURL.contains(exceptedURL)){
            System.out.println("URL Test PASSED");
        }else {
            System.out.println("URL Test FAILED, actual URL : "+actualURL);
        }
    }

    // 8-”Nutella” icin arama yapiniz
    // 9- Kac sonuc bulundugunu yaziniz
    @Test
    public void searchTest(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+ Keys.ENTER);
       String results = driver.findElement(By.xpath("//span[text()='1-48 of 125 results for']")).getText();
       Arrays.stream(results.split(" ")).limit(3).skip(2).forEach(t-> System.out.println(t+" tane sonuc bulundu..."));
    }

    @AfterClass
    public static void tearDown(){
        driver.close();
    }






}
