package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HubcomfyHomePage {
    public HubcomfyHomePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement signIn;

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
        public WebElement passwordInput;

    @FindBy(xpath = "//*[@value='Sign In']")
    public WebElement SignInButton;

    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='btn btn-search'])[1]")
    public WebElement searchButton;

    @FindBy(xpath = "(//li[.=text()])[3]")
    public WebElement searchResults;

    @FindBy(xpath = "(//*[@class='product-media'])[1]")
    public WebElement firstProduct;

    @FindBy(xpath = "//*[@class='cart-label']")
    public WebElement cart;

    @FindBy(xpath = "//*[@class='button wc-forward']")
    public WebElement viewCart;


}
