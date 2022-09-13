package day05;

import org.junit.Test;

public class C01_Notasyon {

    //Java'daki gibi Selenium'dada belirli isleri yapan methodlar olusturabiliriz
    //Ancak bunlar cagrilmadikca calismaz
    public void ilkTestMethodu(){
        System.out.println("Ilk test methodumuz...");
    }

    //JUnit ile notasyon kullanarak siradan method'lari test test method'una donusturebiliriz
    //Bir Test method'u bagimsiz olarak calisabilirken test yapmamiza imkan verir
    //@Test notasyonu sayesinde main method mecburiyeti ortadan kalkar
    //@Test --> en onemli ozelligi bagimsiz olarak calisabilmesi
    @Test
    public void notasyonluIlkTestMethodu(){

    }

}
