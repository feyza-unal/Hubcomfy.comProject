package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CheckoutPage {
    public CheckoutPage () {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "payment")
    public WebElement paymentMethods;

    @FindBy(id = "payment_method_cod")
    public WebElement payAtTheDoor;

    @FindBy(id = "place_order")
    public WebElement placeOrder;

    @FindBy(xpath = "//*[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement orderSuccessMessage;

}
