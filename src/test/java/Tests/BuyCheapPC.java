package Tests;

import BaseTest.BaseTest;
import Screens.*;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BuyCheapPC extends BaseTest {


    @Test(priority = 1)
    public static void Login() {

        LandingScreen landingScreen = new LandingScreen(driver);
        LoginScreen loginScreen = new LoginScreen(driver);


        Allure.step("Login button displayed");

        landingScreen.LoginBtn.click();
        Allure.step("Login button clicked");

        loginScreen.EmailField.sendKeys("cornemarais96@gmail.com");
        Allure.step("Enter email");

        loginScreen.Password.sendKeys("a846321126");
        Allure.step("Enter Password");

        loginScreen.LoginBtn.click();
        Allure.step("Click Login button");



    }

    @Test(priority = 2)
    public static void Navigate_To_Computers() {

        LandingScreen landingScreen = new LandingScreen(driver);

        landingScreen.ComputersLink.click();
        Allure.step("Click computer link");

        landingScreen.DesktopsLink.click();
        Allure.step("Click Desktops link");
    }

    @Test(priority = 3)
    public static void AddOwnCheapPC() {

        LandingScreen landingScreen = new LandingScreen(driver);
        AddToCartScreen addToCartScreen = new AddToCartScreen(driver);

        landingScreen.AddToCartBtn.click();
        Allure.step("Add Build your own cheap pc");

        addToCartScreen.waitForVisibility(addToCartScreen.AddToCartBtn2);
        addToCartScreen.AddToCartBtn2.click();
        Allure.step("Click add to cart");


    }

    @Test(priority = 4)
    public static void NavigateToCart() {

        LandingScreen landingScreen = new LandingScreen(driver);
        ShoppingCartScreen shoppingCartScreen = new ShoppingCartScreen(driver);

        landingScreen.waitForVisibility(landingScreen.ShoppingCartBtn);
        landingScreen.ShoppingCartBtn.click();
        Allure.step("CLick Shopping cart");

        shoppingCartScreen.TCsCheckBox.click();
        Allure.step("Check Ts&Cs");

        shoppingCartScreen.CheckoutBtn.click();
        Allure.step("Click Checkout button");
    }

    @Test(priority = 5)
    public static void CheckItemOut() {

        CheckoutScreen checkoutScreen = new CheckoutScreen(driver);

        checkoutScreen.ContinueBtn1.click();
        checkoutScreen.waitForVisibility(checkoutScreen.ContinueBtn2);
        checkoutScreen.ContinueBtn2.click();
        checkoutScreen.waitForVisibility(checkoutScreen.ContinueBtn3);
        checkoutScreen.ContinueBtn3.click();
        checkoutScreen.waitForVisibility(checkoutScreen.ContinueBtn4);
        checkoutScreen.ContinueBtn4.click();
        checkoutScreen.waitForVisibility(checkoutScreen.ContinueBtn5);
        checkoutScreen.ContinueBtn5.click();
        checkoutScreen.waitForVisibility(checkoutScreen.ConfirmBtn);
        checkoutScreen.ConfirmBtn.click();


    }

    @Test(priority = 6)
    public static void Get_Order_number() {

        CheckoutScreen checkoutScreen = new CheckoutScreen(driver);

        checkoutScreen.waitForVisibility(checkoutScreen.OrderNumber);

        String getOrderNumber = checkoutScreen.OrderNumber.getText();

        System.out.println(getOrderNumber);
    }

    @Test(priority = 7)
    public static void LogOut(){

        LandingScreen landingScreen = new LandingScreen(driver);

        landingScreen.LogOutBtn.click();
    }

}




