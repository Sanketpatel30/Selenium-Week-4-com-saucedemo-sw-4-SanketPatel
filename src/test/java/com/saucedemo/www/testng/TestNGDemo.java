package com.saucedemo.www.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am in before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am in after method");
    }
    @Test
    public void test1(){
        System.out.println("I am in test1");
    }

    @Test
    public void test2(){
        System.out.println("I am in test2");
    }
}
