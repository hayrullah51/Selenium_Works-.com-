package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_XPath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        Thread.sleep(2000);
        //boolean deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']")).isEnabled();
        boolean deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).isDisplayed();
        // boolean deleteButton = driver.findElement(By.tagName("//button)")).isEnabled();

        if (deleteButton) {
            System.out.println("Delete butonu var, Test PASSED");
            //boolean deleteButton2 = driver.findElement(By.xpath())

        } else {
            System.out.println("Delete butonu yok, Test FAILED");
        }
        driver.findElement(By.xpath("//button[@class='added-manually']")).click();

        try {
            WebElement deleteButton2 = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
            System.out.println("Delete butonu var");
        } catch (Exception e) {
            System.out.println("Delete butonu yok!!!");
        }
        driver.close();

    }
}
