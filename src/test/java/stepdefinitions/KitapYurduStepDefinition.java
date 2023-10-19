package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.KitapyurduPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class KitapYurduStepDefinition {
    KitapyurduPage kitap = new KitapyurduPage();

    @Given("kullanici kitapyurdu sayfasina gider")
    public void kullaniciKitapyurduSayfasinaGider() {
        Driver.getDriver().get("https://www.kitapyurdu.com/");
        ReusableMethods.bekle(2);
        ReusableMethods.click(kitap.cerezKabul);
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciIntSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @Then("kullanici kitapyurdu arama kutusunda Suc ve Ceza aratir")
    public void kullaniciKitapyurduAramaKutusundaSucVeCezaAratir() {
       kitap.aramaKutusu.sendKeys("Suc ve Ceza", Keys.ENTER);
    }

    @And("kullanici cikan sonuclardan ilk urunu sepete ekler")
    public void kullaniciCikanSonuclardanIlkUrunuSepeteEkler() {
        kitap.ilkUrunSepeteEkle.click();
    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }


    @Then("kullanici kitapyurdunda properties den {string} arama yapar")
    public void kullaniciKitapyurdundaPropertiesDenAramaYapar(String a) {
        kitap.aramaKutusu.sendKeys(ConfigReader.getProperty(a),Keys.ENTER);
    }

    @And("kitapyurdu sayfasinda girisyap butonuna tiklar")
    public void kitapyurduSayfasindaGirisyapButonunaTiklar() {
        kitap.girisButonu.click();
    }

    @And("verilen {string} ve {string} lerle giris yapar")
    public void verilenVeLerleGirisYapar(String email, String password) {
        kitap.girisEpostaKutusu.sendKeys(ConfigReader.getProperty(email),Keys.TAB,password,Keys.ENTER);
    }

    @Then("kitapyurdu arama kutusunda verilen {string} aratilir")
    public void kitapyurduAramaKutusundaVerilenAratilir(String book) {
       kitap.aramaKutusu.sendKeys(book,Keys.ENTER);
    }
}
