package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");
       WebElement sign_in = driver.findElement(By.linkText("Sign in"));
       sign_in.click();

       Thread.sleep(3000);
       WebElement email_giris = driver.findElement(By.id("session_email"));

       WebElement password_giris = driver.findElement(By.id("session_password"));

       WebElement sing_in_buton = driver.findElement(By.name("commit"));



        email_giris.sendKeys("testtechproed@gmail.com");
       password_giris.sendKeys("Test1234!");

       WebElement sing_inn = driver.findElement(By.xpath("//*[@id=\"clearance\"]/div/div/form/div[3]/input"));
       sing_inn.click();

       //Expected user id 'testtechproed@gmail.com' mu?
        WebElement kullanici_adi = driver.findElement(By.className("navbar-text"));
        String userName = "testtechproed@gmail.com";
        if (kullanici_adi.getText().equals(userName)){
            System.out.println("Expected user_id ve getirilen id ayni Test PASSED");
        }else {
            System.out.println("Expected user_id ve getirilen id farkli Test FAILED");
        }

       WebElement address_linki = driver.findElement(By.linkText("Addresses"));
        System.out.println("Adress linki goruluyor mu?  --> "+address_linki.isEnabled());

        //sayfada kac link var ?
        List<WebElement> linkler = driver.findElements(By.tagName("a"));
        System.out.println("link sayisi : "+linkler.size());

        //linklerin tum elementleri yazalim foor loop veya foreach ile
        for (WebElement each:linkler
             ) {
            System.out.println(each.getText());
        }
        System.out.println("**************************************");
        linkler.stream().forEach(t-> System.out.println(t.getText()));
        driver.close();




    }
}
