package tests.us06;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HubcomfyHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC01 {
    HubcomfyHomePage hubcomfyHomePage = new HubcomfyHomePage();

    @Test
    public void test01() {
//        https://hubcomfy.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hubcomfy_url"));

//        Sign in butonuna tikla
        hubcomfyHomePage.signIn.click();

//        Email bilgilerini gir
        hubcomfyHomePage.usernameInput.sendKeys(ConfigReader.getProperty("hubcomfy_username"));

//        Password bilgilerini gir
        hubcomfyHomePage.passwordInput.sendKeys(ConfigReader.getProperty("hubcomfy_password")+ Keys.ENTER);
        ReusableMethods.waitFor(2);

//        Sign in butonuna tikla
//        hubcomfyHomePage.signInButton.click();
//        ReusableMethods.waitFor(2);

//        Search cubuguna aramak istenen urunun ismini gir
        hubcomfyHomePage.searchBox.sendKeys(ConfigReader.getProperty("hubcomfy_arananUrun"));

//        Arama butonuna tikla
        hubcomfyHomePage.searchButton.click();
        ReusableMethods.waitFor(2);

//        Istenen urune ait arama yapildigini dogrula
        String results = hubcomfyHomePage.searchResults.getText();
        Assert.assertTrue(results.contains("iphone"));

        Driver.closeDriver();
    }
}
