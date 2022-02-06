package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {
    //POM da farkli classlara farkli sekilde ulasilmasi benimsenmistir
    //Driver class icin static yontem kullankiyoruz
    //Page classalrai icinse obje uzerinden kullanilmasi tercih edilmistir
    @Test
    public void test01(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //arama kutusuna nutella yazip aratalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        //arama sonuclarini nutella icerdigini test edelim

        String actualSonucStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucStr.contains("Nutella"));

        Driver.closeDriver();
    }
    @Test
    public void test02(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //java icin arama yapalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Java");
        //sonucun java icerdigini test edelim
        String sonucYazisiStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiStr.contains("Java"));

    }
}
