package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.awt.*;
import java.util.List;

public class ComparePage {

    public ComparePage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "main")
    public WebElement comparisonArea;

    @FindBy(xpath = "//*[@class='w-icon-times-solid']")
    public List<WebElement> xButton;


}
