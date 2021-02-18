package com.mot.challenge2.ui_layer.pages;

import com.mot.challenge2.ui_layer.base.Ui_Layer;
import com.mot.challenge2.ui_layer.component.launch.CreateForm;
import org.openqa.selenium.By;

public abstract class LaunchPage extends Ui_Layer {
    private By ADMIN_FOOTER_LINK = By.linkText("Admin panel");
    private By USER_NAME = By.id("username");
    private By PASSWORD = By.id("password");
    private By LOGIN = By.id("doLogin");

    public LaunchPage toLogInWithCredentials(String username, String password) {
        findElement(ADMIN_FOOTER_LINK).click();
        findElement(USER_NAME).sendKeys(username);
        findElement(PASSWORD).sendKeys(password);
        findElement(LOGIN).click();
        return this;
    }
}
