package com.mot.challenge2.ui_layer.component.launch;

import com.mot.challenge2.enums.LaunchOption;
import com.mot.challenge2.ui_layer.pages.ContactFormPage;
import com.mot.challenge2.ui_layer.pages.LaunchPage;

public class ContactFormComponent extends LaunchComponent {
    @Override
    public LaunchPage toLaunch() {
        driver.get(LaunchOption.CONTACT_FORM.toString());
        return new ContactFormPage();
    }
}
