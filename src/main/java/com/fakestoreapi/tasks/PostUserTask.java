package com.fakestoreapi.tasks;

import com.fakestoreapi.models.UserModel;
import com.fakestoreapi.questions.BuildDataUser;
import com.fakestoreapi.utils.Data;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PostUserTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, String> data = Data.extractTo().get(0);
        UserModel userInf = actor.asksFor(BuildDataUser.was());
        actor.attemptsTo(
                Post.to(data.get("endpoint")).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(userInf)
                )

        );
    }
    public static PostUserTask on( ){

        return instrumented(PostUserTask.class);
}
}