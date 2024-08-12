package Screens;

import Utils.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingScreen extends PageBase {

    public LandingScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    // Login Button
    @FindBy(xpath = "//a[@class='ico-login']")
    public WebElement LoginBtn;

    //Categories - Computers link
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Computers']")
    public WebElement ComputersLink;

    //Desktops Link
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    public WebElement DesktopsLink;

    //Add to Cart
    @FindBy(xpath = "//div[@class='master-wrapper-content']//div[1]//div[1]//div[2]//div[3]//div[2]//input[1]")
    public WebElement AddToCartBtn;

    //Navigate to shopping cart
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    public WebElement ShoppingCartBtn;

    //Logout button
    @FindBy(xpath = "//a[@class='ico-logout']")
    public WebElement LogOutBtn;
    }











