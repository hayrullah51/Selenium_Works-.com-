package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebElements {
    public static void main(String[] args) throws InterruptedException {

        /*
        <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email"
        placeholder="E-posta veya Telefon Numarası" autofocus="1" aria-label="E-posta veya Telefon Numarası">
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tr-tr.facebook.com/");
        //email textbox'a Ali yazdiralim
      WebElement mailTextBox = driver.findElement(By.id("email"));//id ile yaptim
        mailTextBox.sendKeys("Hayrullah.selenium@gmail.com");
        Thread.sleep(2000);
        mailTextBox.clear();
        WebElement mailkutusu_tag_name_ile = driver.findElement(By.tagName("input"));
        //mailkutusu_tag_name_ile.sendKeys("hayrullah.tagname@gmail.com");
        //input tag name ile 6 tane web element oldugundan hangisine yazacagina karar verremiyor
        //web element'i buldugu icin NoSuchElementException hatasi vermez!



        //WebElement yanlis_element = driver.findElement(By.id("emailyanlis"));
        //yanlis_element.sendKeys("yanlisEleman");
        //ONEMLI!!! Eger olmayan bir elemantle arama yaparsak NoSuchElementException  hatasi verir!...
        // NoSuchElementException hatasi aliyorsak locaterlarimizi kontrol etmeliyiz...

        //giris yap butonuna tiklayalim
        WebElement giris_butonu = driver.findElement(By.tagName("button"));
        System.out.println(giris_butonu.isEnabled());
        giris_butonu.click();










    }
}
