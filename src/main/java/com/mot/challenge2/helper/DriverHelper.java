package com.mot.challenge2.helper;

import com.mot.challenge2.enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverHelper {

    private static ThreadLocal<WebDriver> webDriverThreadLocal;

    public static void createDriver(String browserName){
        WebDriver driver;
        driver = startUpBrowser(browserName);
        setDriver(driver);
    }

    public static WebDriver getDriver(){
        return webDriverThreadLocal.get();
    }
    private static void setDriver(WebDriver driver) {
        if (webDriverThreadLocal == null) {
            webDriverThreadLocal = ThreadLocal.withInitial(() -> driver);
            webDriverThreadLocal.set(driver);
        }
        webDriverThreadLocal.set(driver);
    }

    private static WebDriver startUpBrowser(String browserName){
        if (browserName.equals(Browser.CHROME.name().toLowerCase())) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if(browserName.equals(Browser.EDGE.name().toLowerCase())) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        } else {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }

    }

}
