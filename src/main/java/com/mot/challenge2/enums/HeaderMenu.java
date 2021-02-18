package com.mot.challenge2.enums;

public enum HeaderMenu {
    ROOMS("Rooms"),
    REPORT("Report"),
    BRANDING("Branding");

    private String value;
    HeaderMenu(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
