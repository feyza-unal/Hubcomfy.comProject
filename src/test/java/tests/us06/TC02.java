package tests.us06;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HubcomfyHomePage;
import pages.ProductPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC02 {
    HubcomfyHomePage hubcomfyHomePage = new HubcomfyHomePage();

    ProductPage productPage = new ProductPage();

    @Test
    public void test02() {

//        https://hubcomfy.com/ adresine git
        ReusableMethods.goToURL();

//        Login islemi yap
        ReusableMethods.loginMethod();

//        Search cubuguna aramak istenen urunun ismini gir ve arama butonuna tikla
        hubcomfyHomePage.searchBox.sendKeys(ConfigReader.getProperty("hubcomfy_arananUrun") + Keys.ENTER);

//        Ilk urune tikla
        hubcomfyHomePage.firstProduct.click();
        ReusableMethods.waitFor(2);

//        ADD TO CART butonuna tikla
        productPage.addToCartButton.click();

//        Urunun sepete eklendigine dair mesajin goruntulendigini dogrula
        Assert.assertTrue(productPage.popUpMessage.isDisplayed());

        Driver.closeDriver();

    }
}
