package com.fakestoreapi.tasks;

import com.fakestoreapi.models.UserModel;
import com.fakestoreapi.questions.BuildDataUser;
import com.fakestoreapi.utils.Data;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PutUserTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, String> data = Data.extractTo().get(0);
        UserModel userInf = actor.asksFor(BuildDataUser.was());
        actor.attemptsTo(
                Put.to(data.get("endpoint")+"/"+ data.get("id")).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(userInf)
                )
        );
    }
    public static PostUserTask on(){
        return instrumented(PostUserTask.class);
    }
}
