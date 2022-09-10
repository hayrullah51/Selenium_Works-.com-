package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_AmazonArama {
    public static void main(String[] args) {

        /*
        Amazn web sayfasina gidip
        java icin arama yapalim
        ve bulunan sonuc sayisini yazdiralim
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");

        WebElement arama_cubugu = driver.findElement(By.id("twotabsearchtextbox"));
        arama_cubugu.sendKeys("Java" + Keys.ENTER);

        WebElement sonuc_yazisi = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonuc_yazisi.getText());

        //Web element'ler obje oldugu icin direkt yazdirilamazlar
        //webElement'in sahip oldugu yaziyi string olarak
        //yazdirmak icin getText() kullanilir



    }
}
