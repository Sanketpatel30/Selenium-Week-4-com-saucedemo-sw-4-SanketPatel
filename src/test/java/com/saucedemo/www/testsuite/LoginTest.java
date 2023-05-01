package com.saucedemo.www.testsuite;

import com.saucedemo.www.pages.InventoryPage;
import com.saucedemo.www.pages.LoginPage;
import com.saucedemo.www.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();
    private InventoryPage inventoryPage1;

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserNameField("standard_user");
        loginPage.enterPasswordField("secret_sauce");
        loginPage.clickOnLoginButton();
        String actualMessage = inventoryPage.getProductText();
        Assert.assertEquals(actualMessage, "Products", "error");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterUserNameField("standard_user");
        loginPage.enterPasswordField("secret_sauce");
        loginPage.clickOnLoginButton();
        //WebDriverWait wait = new WebDriverWait(driver,30);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("inventoryPage")));
        int actualMessage = inventoryPage.getFindActualNumberOfProducts();
        int expected = 6;
        Assert.assertEquals(actualMessage, expected, "error");
    }
}
