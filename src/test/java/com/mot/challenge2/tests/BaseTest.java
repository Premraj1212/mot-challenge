package com.mot.challenge2.tests;

import com.mot.challenge2.helper.DriverHelper;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    @Before
    public void setup(){
        DriverHelper.createDriver("chrome");
    }

    @After
    public void teardown(){
        DriverHelper.getDriver().quit();
    }
}
