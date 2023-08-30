package com.fakestoreapi.questions;

import com.fakestoreapi.models.responseDelet.DeletUserModel;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DeleteResponse implements Question<DeletUserModel> {
    @Override
    public DeletUserModel answeredBy(Actor actor) {
       return SerenityRest.lastResponse().as(DeletUserModel.class);
    }
    public static DeleteResponse was(){
        return  new DeleteResponse();
    }
}
