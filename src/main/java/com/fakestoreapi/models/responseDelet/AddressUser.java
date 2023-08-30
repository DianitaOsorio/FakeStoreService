package com.fakestoreapi.models.responseDelet;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class AddressUser {

    @JsonProperty ("geolocation")
    public GeolocationUser geolocation;

    @JsonProperty ("city")
    public String city;

    @JsonProperty ("street")
    public String street;

    @JsonProperty ("number")
    public Integer number;

    @JsonProperty ("zipcode")
    public String zipcode;



}
