package com.mot.challenge2.ui_layer.component.launch;

import com.mot.challenge2.enums.LaunchOption;
import com.mot.challenge2.ui_layer.pages.BrandingPage;
import com.mot.challenge2.ui_layer.pages.LaunchPage;

public class BrandingComponent extends LaunchComponent {
    @Override
    public LaunchPage toLaunch() {
        driver.get(LaunchOption.BRANDING.toString());
        return new BrandingPage();
    }
}
