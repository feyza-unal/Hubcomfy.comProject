package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.awt.*;
import java.util.List;

public class SearchResultPage {
    public SearchResultPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[1]")
    public WebElement compareButton;

    @FindBy(xpath = "(//*[@class='product-media'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "(//*[@class='product-media'])[2]")
    public WebElement secondProduct;

    @FindBy(xpath = "(//*[@class='product-media'])[3]")
    public WebElement thirdProduct;

    @FindBy(xpath = "(//*[@class='product-media'])[4]")
    public WebElement fourthProduct;

    @FindBy(xpath = "(//*[@class='product-media'])[5]")
    public WebElement fifthProduct;

    @FindBy(xpath = "//*[@class='compare-popup-overlay']")
    public WebElement blankSpace;

    @FindBy(xpath = "//*[@class='btn btn-dark btn-rounded']")
    public WebElement startCompareButton;

    @FindBy(xpath = "(//*[@class='compare btn-product-icon added'])[5]")
    public WebElement fifthPCompareButton;

    @FindBy(xpath = "//*[@class='btn-remove remove_from_compare fas fa-times']")
    public WebElement removeFromComprsnBttn;

    @FindBy(xpath = "(//*[@class='compare-heading']//*[.=text()])[2]")
    public WebElement choosenProducts;

    @FindBy(xpath = "//*[@class='compare-clean']")
    public WebElement cleanAllButton;




}
