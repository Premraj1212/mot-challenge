package com.mot.challenge2.enums;

public enum Credential {
    USERNAME("admin"),
    PASSWORD("password");

    private String value;

    Credential(String value){
        this.value =value;
    }

    @Override
    public String toString(){
        return value;
    }
}
