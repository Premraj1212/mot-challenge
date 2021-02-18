package com.mot.challenge2.ui_layer.pages;

import com.mot.challenge2.data_model.ContactInfo;
import com.mot.challenge2.enums.LaunchOption;
import com.mot.challenge2.ui_layer.component.launch.CreateForm;
import org.openqa.selenium.By;

import static com.mot.challenge2.helper.ResourceHelper.getDataYml;

public class ContactFormPage extends LaunchPage implements CreateForm {
    private By CONTACT_NAME = By.id("name");
    private By CONTACT_EMAIL = By.id("email");
    private By CONTACT_PHONE = By.id("phone");
    private By CONTACT_SUBJECT = By.id("subject");
    private By CONTACT_MESSAGE = By.id("description");
    private By CONTACT_SUBMIT = By.id("submitContact");
    private By CONTACT_CNFM = By.xpath("//h2[contains(text(),'Thanks for getting in touch')]");
    ContactInfo contactInfo = getDataYml("src\\test\\resources\\data\\contactData.yml", ContactInfo.class);


    public boolean isMessageSent(){
        return findElement(CONTACT_CNFM).isDisplayed();
    }

    @Override
    public ContactFormPage toCreateForm() {
        findElement(CONTACT_NAME).sendKeys(contactInfo.getName());
        findElement(CONTACT_EMAIL).sendKeys(contactInfo.getEmail());
        findElement(CONTACT_PHONE).sendKeys(contactInfo.getPhone());
        findElement(CONTACT_SUBJECT).sendKeys(contactInfo.getSubject());
        findElement(CONTACT_MESSAGE).sendKeys(contactInfo.getMessage());
        findElement(CONTACT_SUBMIT).click();
        return this;
    }
}
