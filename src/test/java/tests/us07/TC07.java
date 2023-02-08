package tests.us07;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ComparePage;
import pages.HubcomfyHomePage;
import pages.SearchResultPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC07 {
    HubcomfyHomePage hubcomfyHomePage = new HubcomfyHomePage();
    SearchResultPage searchResultPage = new SearchResultPage();
    ComparePage comparePage = new ComparePage();

    @Test
    public void test07() {
//        https://hubcomfy.com/ adresine git
        ReusableMethods.goToURL();

//        Search cubuguna aramak istenen urunun ismini gir ve arama butonuna tikla
        hubcomfyHomePage.searchBox.sendKeys(ConfigReader.getProperty("hubcomfy_karsilastirilanUrun")+ Keys.ENTER);

//        Ilk urunun uzerine gelip Compare butonuna tikla
        ReusableMethods.hoverOverOnElementActions(searchResultPage.firstProduct);
        ReusableMethods.waitFor(2);
        searchResultPage.compareButton.click();

//        Urunlerin goruntulendigi sayfaya tikla
        searchResultPage.blankSpace.click();

//        Ikinci urunun uzerine gelip Compare butonuna tikla
        ReusableMethods.hoverOverOnElementActions(searchResultPage.secondProduct);
        ReusableMethods.waitFor(2);
        searchResultPage.compareButton.click();

//        Compare Products penceresinde Start Compare butonuna tikla
        ReusableMethods.waitFor(2);
        searchResultPage.startCompareButton.click();

//        Karsilastirma sayfasinda silmek istenen urunun uzerindeki X butonuna tikla
        ReusableMethods.waitFor(2);
        comparePage.xButton.get(0).click();

//        Urunun karsilastirma sayfasinda goruntulenmedigini dogrula
        ReusableMethods.waitFor(2);
        Assert.assertTrue(comparePage.xButton.size()==1);
    }
}
