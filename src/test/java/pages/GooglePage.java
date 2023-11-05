package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@type='search']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "(//*[.='Tümünü kabul et'])[2]")
    public WebElement cerezKabulEt;


}
