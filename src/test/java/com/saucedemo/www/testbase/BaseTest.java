package com.saucedemo.www.testbase;

import com.saucedemo.www.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest extends Utility {

    String browser = "Chrome";
@BeforeMethod
    public void setUp(){
    selectBrowser(browser);
    }
@AfterMethod
    public void tearDown(){
closeBrowser();
    }
}
