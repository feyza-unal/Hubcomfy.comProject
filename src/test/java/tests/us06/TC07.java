package tests.us06;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HubcomfyHomePage;
import pages.ProductPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC07 {
    HubcomfyHomePage hubcomfyHomePage = new HubcomfyHomePage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    @Test
    public void test07() {
//        https://hubcomfy.com/ adresine git
        ReusableMethods.goToURL();

//        Login islemi yap
        ReusableMethods.loginMethod();

//        Search cubuguna aramak istenen urunun ismini gir ve arama butonuna tikla
        hubcomfyHomePage.searchBox.sendKeys(ConfigReader.getProperty("hubcomfy_arananUrun") + Keys.ENTER);

//        Istenen urune tikla
        hubcomfyHomePage.firstProduct.click();
        ReusableMethods.waitFor(2);

//        ADD TO CART butonuna tikla
        productPage.addToCartButton.click();

//        Cart butonuna tikla
        hubcomfyHomePage.cart.click();

//        VIEW CART butonuna tikla
        hubcomfyHomePage.viewCart.click();

//        PROCEED TO CHECKOUT butonuna tikla
        ReusableMethods.scrollIntoViewJS(cartPage.proceedToCheckoutButton);
        ReusableMethods.waitFor(2);
        cartPage.proceedToCheckoutButton.click();

//        Payment Methods alaninda odeme seceneklerinin goruntulendigini dogrula
        ReusableMethods.scrollIntoViewJS(checkoutPage.paymentMethods);
        ReusableMethods.waitFor(2);
        Assert.assertTrue(checkoutPage.paymentMethods.isDisplayed());

        Driver.closeDriver();
    }
}
