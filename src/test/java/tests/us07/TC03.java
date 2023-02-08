package tests.us07;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ComparePage;
import pages.HubcomfyHomePage;
import pages.SearchResultPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC03 {
    HubcomfyHomePage hubcomfyHomePage = new HubcomfyHomePage();
    SearchResultPage searchResultPage = new SearchResultPage();
    @Test
    public void test03() {
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

//        Urunlerin goruntulendigi sayfaya tikla
        searchResultPage.blankSpace.click();

//        Besinci urunun Compare butonuna tiklanamadigini dogrula
        ReusableMethods.hoverOverOnElementActions(searchResultPage.fifthProduct);
        ReusableMethods.waitFor(2);
        searchResultPage.compareButton.click();
        searchResultPage.blankSpace.click();
        ReusableMethods.hoverOverOnElementActions(searchResultPage.fifthProduct);
        Assert.assertFalse(searchResultPage.fifthPCompareButton.isDisplayed()); //bug


    }
}
