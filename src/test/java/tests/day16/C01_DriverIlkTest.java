package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {
    //Driver class sayesinde bizim eski driver oldu
    //artik driver a iht varsa Driver.getDriver() yazacagiz

    @Test
    public void test01(){
        //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //amazona gittigimizi test edelim
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Amazon"));

        //Driver.getDriver methodu her calistiginda
        //driver=new ChromeDriver(); komutundan dolayi yeni bi driver olusturuyor
        //biz ise classdan driveri ilk calistirdigimizda new atamasi olsun
        // sonraki calismalarda olmasin istiyoruz
        //bunun icin Driver daki Webdriver i bir if blogunun icine koyduk,duzeldi

        //boolean titleTest=Driver.getDriver().getTitle().contains("Amazon.com");
        //        Assert.assertTrue(titleTest); 2.yol ile
        Driver.closeDriver();//methoddan sonra close yapinca simdi yeni page acacak
    }
    @Test
    public void test02(){
        //bestbuy anasayfaya gidelim
        Driver.getDriver().get("https://www.bestbuy.com");
        //bestbuya gittigimizi test edelim
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("bestbuy"));
        Driver.closeDriver();

    }

}
