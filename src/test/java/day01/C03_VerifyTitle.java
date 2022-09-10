package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyTitle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");


        String expectedTitle = "amazon";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println("Titler beklenen deger ile ayni. test PASS");
        } else {
            System.out.println("title beklenenden farkli, Test FAILED");
            System.out.println("Aktuel Title : "+actualTitle+" ---> "+"Bekledigimiz Title : "+expectedTitle);
        }
        driver.close();



    }
}
