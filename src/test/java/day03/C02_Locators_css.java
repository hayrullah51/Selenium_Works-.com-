package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Locators_css {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");
        Thread.sleep(2000);

        WebElement email_box = driver.findElement(By.cssSelector(".form-control"));
        email_box.sendKeys("testtechproed@gmail.com");
       // WebElement password_box = driver.findElement((By.cssSelector("(.form-control)[2]")));
        WebElement password_box = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        password_box.sendKeys("Test1234!");

       WebElement sing_in_button = driver.findElement(By.cssSelector("input[type='submit']"));

        sing_in_button.click();

        driver.close();
    }
}
