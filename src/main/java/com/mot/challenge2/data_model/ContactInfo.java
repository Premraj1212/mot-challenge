package com.mot.challenge2.data_model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactInfo {
    @JsonProperty("name")String name;
    @JsonProperty("email")String email;
    @JsonProperty("phone")String phone;
    @JsonProperty("subject")String subject;
    @JsonProperty("message")String message;
}
