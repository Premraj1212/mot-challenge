package com.mot.challenge2.ui_layer.pages;

import com.mot.challenge2.enums.LaunchOption;
import com.mot.challenge2.ui_layer.component.launch.CreateForm;
import org.openqa.selenium.*;

public class BrandingPage extends LaunchPage implements CreateForm{

    private By BRANDING_NAME = By.id("name");
    private By BRANDING_SUBMIT = By.id("updateBranding");
    private By CNFM_CLOSE = By.xpath("//button[normalize-space()='Close']");


    public int confirmAlertIsDisplayed(){
        return findElements(CNFM_CLOSE).size();
    }


    @Override
    public BrandingPage toCreateForm() {
        driver.navigate().to(LaunchOption.BRANDING.toString());
        fluentWait.until(driver -> findElement(BRANDING_NAME));
        findElement(BRANDING_NAME).click();
        findElement(BRANDING_NAME).clear();
        findElement(BRANDING_NAME).sendKeys("test");
        findElement(BRANDING_SUBMIT).click();
        return this;
    }
}
