package Screens;

import Utils.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartScreen extends PageBase {

    public ShoppingCartScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
}

    //Agree TcS
    @FindBy(xpath = "//input[@id='termsofservice']")
    public WebElement TCsCheckBox;

    //Checkout button
    @FindBy(xpath = "//button[@id='checkout']")
    public WebElement CheckoutBtn;

}
