package com.fakestoreapi.tasks;

import com.fakestoreapi.utils.Data;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteUserTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Map<String, String> data = Data.extractTo().get(0);
        actor.attemptsTo(
                Delete.from(data.get("endpoint")+"/"+ data.get("id")).
                        with(
                                requestSpecification -> requestSpecification
                                        .contentType(ContentType.JSON)
                        )
        );
    }
    public static DeleteUserTask on(){
        return instrumented(DeleteUserTask.class);
    }
}
