package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class GoogleStepdefinition {
    GooglePage google = new GooglePage();
    @And("kullanici google cerezleri kabul eder")
    public void kullaniciGoogleCerezleriKabulEder() {
        try {
            ReusableMethods.scrollEnd();
            google.cerezKabulEt.click();
        } catch (Exception e) {
            System.out.println("Cerez cikmadi");
        }
        ReusableMethods.bekle(2);
    }

    @Given("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String nesne) {
        google.aramaKutusu.sendKeys(nesne,Keys.ENTER);
    }

    @And("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String nesne) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(nesne));
    }
}
