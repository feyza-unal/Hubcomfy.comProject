package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductPage {
    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@name='add-to-cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//*[@class='woocommerce-message alert alert-simple alert-btn alert-success']")
    public WebElement popUpMessage;



}
