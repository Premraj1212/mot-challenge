package com.mot.challenge2.enums;

public enum LaunchOption {
    ADMIN_PANEL("https://automationintesting.online/#/"),
    BRANDING("https://automationintesting.online/#/admin/branding"),
    CONTACT_FORM("https://automationintesting.online"),
    ENQUIRY("https://automationintesting.online/#/admin/messages");

    private String value;

    LaunchOption(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
