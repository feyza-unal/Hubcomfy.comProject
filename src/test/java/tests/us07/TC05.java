package tests.us07;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ComparePage;
import pages.HubcomfyHomePage;
import pages.SearchResultPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC05 {
    HubcomfyHomePage hubcomfyHomePage = new HubcomfyHomePage();
    SearchResultPage searchResultPage = new SearchResultPage();
    @Test
    public void test05() {
//        https://hubcomfy.com/ adresine git
        ReusableMethods.goToURL();

//        Search cubuguna aramak istenen urunun ismini gir ve arama butonuna tikla
        hubcomfyHomePage.searchBox.sendKeys(ConfigReader.getProperty("hubcomfy_karsilastirilanUrun")+ Keys.ENTER);

//        Ilk urunun uzerine gelip Compare butonuna tikla
        ReusableMethods.hoverOverOnElementActions(searchResultPage.firstProduct);
        ReusableMethods.waitFor(2);
        searchResultPage.compareButton.click();

//        Compare Products penceresinde urunun uzerindeki X butonuna tikla
        ReusableMethods.waitFor(2);
        searchResultPage.removeFromComprsnBttn.click();

//        Urunun Compare Products penceresinde goruntulenmedigini dogrula
        ReusableMethods.waitFor(2);
        String expected="0";
        Assert.assertEquals(expected,searchResultPage.choosenProducts.getText());

    }
}
