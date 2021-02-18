package com.mot.challenge2.data_model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
public class RoomInfo  {
    @JsonProperty("roomNumber")String roomNumber;
    @JsonProperty("roomPrice")String roomPrice;
 }


