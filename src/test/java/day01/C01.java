package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty ("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.techproeducation.com");

        System.out.println(driver.getCurrentUrl());//url'i verir
        System.out.println("Su anki title(Baslik)"+driver.getTitle());//title verir.
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        //driver.quit();//birden fazla sayfa acilmis ise kapatir

        driver.close();//close sadece calisan browser'i calisir



    }
}
