package com.mot.challenge2.ui_layer.component.launch;

import com.mot.challenge2.enums.LaunchOption;
import com.mot.challenge2.ui_layer.pages.BookingPage;
import com.mot.challenge2.ui_layer.pages.LaunchPage;

public class BookingComponent extends LaunchComponent {
    @Override
    public LaunchPage toLaunch() {
        driver.get(LaunchOption.ADMIN_PANEL.toString());
        return new BookingPage();
    }
}
