package tests.day16;

import org.testng.annotations.Test;
import pages.HotelMycampPage;
import utilities.Driver;

public class C04_HotelMyCampPositiveLogin {

    @Test
    public void pozitifLoginTesti(){
        //1 ) Bir Class olustur : PositiveTest
        //2) Bir test method olustur positiveLoginTest()
        //        https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");

        //        login butonuna bas

        //    test data username: manager ,
        //    test data password : Manager1!
        //    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et



    }

}
