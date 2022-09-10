package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println("Test PASSED, title is correct");
        } else {
            System.out.println("Test FAILED, title is different");
            System.out.println("actual title ===> " + actualTitle);
            System.out.println("ecpected title ===> " + expectedTitle);
        }

        driver.navigate().to("https://www.walmart.com/");
        String expectedTitle2 = "Walmart.com";
        String actualTitle2 = driver.getTitle();

        if (expectedTitle2.equalsIgnoreCase(actualTitle2)) {
            System.out.println("Test PASSED, title is correct");
        } else {
            System.out.println("Test FAILED, title is different");
            System.out.println("actual title ===> " + actualTitle2);
            System.out.println("ecpected title ===> " + expectedTitle2);
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();

    }
}
