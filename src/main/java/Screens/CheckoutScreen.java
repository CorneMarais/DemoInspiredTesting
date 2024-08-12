package Screens;

import Utils.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutScreen extends PageBase {

    public CheckoutScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
}

    //Billing address Continue button
    @FindBy(xpath = "//input[@onclick='Billing.save()']")
    public WebElement ContinueBtn1;

    //Shipping address Continue button
    @FindBy(xpath = "//input[@onclick='Shipping.save()']")
    public WebElement ContinueBtn2;

    //Shipping method Continue button
    @FindBy(xpath = "//input[@class='button-1 shipping-method-next-step-button']")
    public WebElement ContinueBtn3;

    //Payment method Continue button
    @FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
    public WebElement ContinueBtn4;

    //Payment information Continue button
    @FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
    public WebElement ContinueBtn5;

    //Confirm order Confirm button
    @FindBy(xpath = "//input[@value='Confirm']")
    public WebElement ConfirmBtn;

    //Order number
    @FindBy(xpath = "//li[contains(text(),'Order number:')]")
    public WebElement OrderNumber;



}
