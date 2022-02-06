package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

//bir page classi actigimizda ilk yapmamaiz gereken sey
// parametresiz bir constructor olusturup  bu cons icinde
 //   PageFactory ile drivera ilk deger atamasini yapmak olmalidir

   public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement amazonAramaKutusu;

   @FindBy(xpath="/div[@class='a-section a-spacing-small a-spacing-top-small'] ")
    public WebElement sonucYazisiElementi;

}
