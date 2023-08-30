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

public class DeletUserModel {

    @JsonProperty ("address")
    public AddressUser address;

    @JsonProperty ("id")
    public Integer id;

    @JsonProperty ("email")
    public String email;

    @JsonProperty ("username")
    public String username;

    @JsonProperty ("password")
    public String password;

    @JsonProperty ("name")
    public NameUser name;

    @JsonProperty ("phone")
    public String phone;

    @JsonProperty ("__v")
    public Integer v;



}
