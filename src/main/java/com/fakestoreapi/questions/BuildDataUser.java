package com.fakestoreapi.questions;

import com.fakestoreapi.models.Address;
import com.fakestoreapi.models.GeolocalizacionAddress;
import com.fakestoreapi.models.NameUser;
import com.fakestoreapi.models.UserModel;
import com.fakestoreapi.utils.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Map;

public class BuildDataUser implements Question<UserModel> {

    @Override
    public UserModel answeredBy(Actor actor) {
        Map<String, String> data = Data.extractTo().get(0);
        GeolocalizacionAddress geolocalizacionAddress =  GeolocalizacionAddress.builder()
                .lat("20")
                ._long("10")
                .build();
        Address address = Address.builder()
                .city("medellin")
                .street("calle")
                .number(10)
                .zipcode("+57")
                .geolocation(geolocalizacionAddress)
                .build();
        NameUser nameUser = NameUser.builder()
                .firstname(data.get("nombre"))
                .lastname(data.get("apellido"))
                .build();
        UserModel userModel = UserModel.builder()
                .email(data.get("correo"))
                .username(data.get("usuario"))
                .password(data.get("clave"))
                .name(nameUser)
                .address(address)
                .phone("3217080552")
                .build();

        return userModel;
    }

    public static BuildDataUser was(){
        return  new BuildDataUser();
    }

}
