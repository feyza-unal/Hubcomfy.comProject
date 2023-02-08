package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CartPage {
    public CartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//td[@class='product-name']")
    public WebElement productTitle;

    @FindBy(xpath = "//*[@class='quantity-plus w-icon-plus']")
    public WebElement quantityPlusButton;

    @FindBy(xpath = "//*[@class='quantity-minus w-icon-minus']")
    public WebElement quantityMinusButton;

    @FindBy(xpath = "//*[@name='update_cart']")
    public WebElement updateCartButton;

    @FindBy(xpath = "//*[@class='woocommerce-message alert alert-simple alert-icon alert-close-top alert-success']")
    public WebElement updatePopUpMessage;

    @FindBy(xpath = "//*[@class='checkout-button button alt wc-forward']")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//tr[@class='woocommerce-shipping-totals shipping']")
    public WebElement shippingAdress;



}
