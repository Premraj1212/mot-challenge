package com.mot.challenge2.ui_layer.component.launch;

import com.mot.challenge2.enums.LaunchOption;
import com.mot.challenge2.ui_layer.base.Ui_Layer;
import com.mot.challenge2.ui_layer.pages.EnquiryPage;
import com.mot.challenge2.ui_layer.pages.LaunchPage;

public class EnquiryComponent extends LaunchComponent {

    @Override
    public LaunchPage toLaunch() {
        driver.get(LaunchOption.ENQUIRY.toString());
        return new EnquiryPage();
    }

}
