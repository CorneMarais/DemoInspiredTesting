package Screens;

import Utils.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen extends PageBase {

    public LoginScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    // Email field
    @FindBy(xpath = "//input[@id='Email']")
    public WebElement EmailField;

    // Password field
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement Password;

    @FindBy(xpath = "//input[@value='Log in']")
    public WebElement LoginBtn;



}
