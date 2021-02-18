package com.mot.challenge2.ui_layer.pages;

import com.mot.challenge2.enums.LaunchOption;
import org.openqa.selenium.By;

public class EnquiryPage extends LaunchPage {

    private By ENQUIRY_LIST = By.cssSelector(".read-false");

    public int getListOfEnquiry(){
        driver.navigate().to(LaunchOption.ENQUIRY.toString());
        return findElements(ENQUIRY_LIST).size();
    }

}
