package com.fakestoreapi.models.responseDelet;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class NameUser {

    @JsonProperty("firstname")
    public String firstname;

    @JsonProperty ("lastname")
    public String lastname;

}
