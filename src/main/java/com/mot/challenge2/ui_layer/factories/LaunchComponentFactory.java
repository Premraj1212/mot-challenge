package com.mot.challenge2.ui_layer.factories;

import com.mot.challenge2.enums.LaunchOption;
import com.mot.challenge2.ui_layer.component.launch.*;

public class LaunchComponentFactory {

    public static LaunchComponent getInstance(LaunchOption option){
        LaunchComponent launchComponent = null;
        switch (option) {
            case ADMIN_PANEL:
                launchComponent = new BookingComponent();
                break;
            case BRANDING:
                launchComponent = new BrandingComponent();
                break;
            case CONTACT_FORM:
                launchComponent = new ContactFormComponent();
                break;
            case ENQUIRY:
                launchComponent = new EnquiryComponent();
                break;
            default:
                new IllegalArgumentException("Not Supported Component");
        }
        return launchComponent;
    }
}
