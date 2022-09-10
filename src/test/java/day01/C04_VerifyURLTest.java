package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyURLTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        String expectedURL = "https://www.amazon.com/";
        String aktuelURL = driver.getCurrentUrl();

        if (expectedURL.equalsIgnoreCase(aktuelURL)){
            System.out.println("Test PASS, it's same");
        }else {
            System.out.println("Test FAILED, it's different");
            System.out.println("Actual URL --> "+aktuelURL);
            System.out.println("Expected URL --> "+expectedURL);

        }
        driver.close();

    }
}
