package tests.day22;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_FacebookTesti {
    @Test
    public void test01(){
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get(" https://www.facebook.com/");
        FacebookPage facebookPage=new FacebookPage();
        facebookPage.facebookCookies.click();
//2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin


//3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker=new Faker();
        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookPage.loginButonu.click();

//4- Basarili giris yapilamadigini test edin

        Assert.assertTrue(facebookPage.girilemediYazisiElementi.isDisplayed());

        ReusableMethods.waitFor(5);
        Driver.closeDriver();
    }




}


