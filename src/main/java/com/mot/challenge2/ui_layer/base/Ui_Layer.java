package com.mot.challenge2.ui_layer.base;

import com.mot.challenge2.helper.DriverHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class Ui_Layer {
    protected WebDriver driver = DriverHelper.getDriver();
    private final int maxWaitTime = 30;
    private final WebDriverWait wait = new WebDriverWait(driver, maxWaitTime);
    private final FluentWait<WebDriver> fluentWaits = new FluentWait<>(driver);

    protected WebElement findElement(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }

    protected List<WebElement> findElements(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElements(locator);
    }
    protected void waitForPageToLoad() {
        wait.until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
    }

    protected WebElement waitForElementToBePresent(By locator) {
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
    }

    protected WebElement waitForElementToBeClickable(By locator) {
        waitForElementToBePresent(locator);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    List<Class<? extends Throwable>> exceptionsToIgnore = new ArrayList<Class<? extends Throwable>>() {
        {
            add(NoSuchElementException.class);
            add(StaleElementReferenceException.class);
        }
    };

    protected Wait<WebDriver> fluentWait = fluentWaits
            .withTimeout(Duration.ofSeconds(maxWaitTime))
            .pollingEvery(Duration.ofSeconds(1))
            .ignoreAll(exceptionsToIgnore)
            .withMessage("The message you will see in if a TimeoutException is thrown");

}
