package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C05_RadioButtonTest {

    /*
    1. Bir class oluşturun : RadioButtonTest
    2. Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
    - https://www.facebook.com adresine gidin
    - “Create an Account” button’una basin
    - “radio buttons” elementlerini locate edin
    - Secili degilse cinsiyet butonundan size uygun olani secin
     */

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
    }


    @Test
    public void test1(){
        //- “Create an Account” button’una basin
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        //- “radio buttons” elementlerini locate edin
        WebElement buttonKadin = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
        WebElement buttonErkek = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
        WebElement buttonOzel = driver.findElement(By.xpath("(//input[@name='sex'])[3]"));

        if (!buttonErkek.isSelected()){
            buttonKadin.click();
        }
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
