package com.browserstack;

import com.browserstack.SeleniumTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BStackDemoTest6 extends SeleniumTest {
    @Test
    public void addProductToCart() throws Exception {
        System.out.println("Running Failed");
        Assert.assertEquals(3, 4);
    }
}
