package Screens;

import Utils.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartScreen extends PageBase {

    public AddToCartScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);}

    //Add to cart button
    @FindBy(xpath = "//input[@id='add-to-cart-button-72']")
    public WebElement AddToCartBtn2;

    //Success notification bar
    @FindBy(id = "bar-notification")
    public WebElement SuccessBar;

}
