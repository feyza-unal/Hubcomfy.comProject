package tests.us07;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ComparePage;
import pages.HubcomfyHomePage;
import pages.SearchResultPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC02 {
    HubcomfyHomePage hubcomfyHomePage = new HubcomfyHomePage();
    SearchResultPage searchResultPage = new SearchResultPage();
    ComparePage comparePage = new ComparePage();
    @Test
    public void test02() {
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

//        Urunlerin goruntulendigi sayfaya tikla
        searchResultPage.blankSpace.click();

//        Ucuncu urunun uzerine gelip Compare butonuna tikla
        ReusableMethods.hoverOverOnElementActions(searchResultPage.thirdProduct);
        ReusableMethods.waitFor(2);
        searchResultPage.compareButton.click();

//        Urunlerin goruntulendigi sayfaya tikla
        searchResultPage.blankSpace.click();

//        Dorduncu urunun uzerine gelip Compare butonuna tikla
        ReusableMethods.scrollIntoViewJS(searchResultPage.fourthProduct);
        ReusableMethods.waitFor(2);
        ReusableMethods.hoverOverOnElementActions(searchResultPage.fourthProduct);
        ReusableMethods.waitFor(2);
        searchResultPage.compareButton.click();

//        Compare Products penceresinde Start Compare butonuna tikla
        ReusableMethods.waitFor(2);
        searchResultPage.startCompareButton.click();

//        Secilen 4 urunun karsilastirildigini dogrula
        Assert.assertTrue(comparePage.comparisonArea.isDisplayed());

        Driver.closeDriver();

    }
}
