package hu.progmatic.dummybackendapp.apitest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;

public class LearnerTests {

    String baseUrl = "http://localhost:8080/api/";

    @Test
    public void learners_LearnerController_hasBeenReachable() {
        when().get(baseUrl + "learners").then()
                .statusCode(200);
    }

    @Test
    public void learners_LearnerController_hasBeenReachableAndJson() {
        when().get(baseUrl + "learners").then()
                .statusCode(200)
                .assertThat()
                .contentType(ContentType.JSON);
    }

    @Test
    public void learners_LearnerController_invalidAPI() {
        when().get(baseUrl + "dummy").then()
                .statusCode(404);
    }

    @Test
    public void learners_LearnerController_validContentSchema() {
        when().get(baseUrl + "learners").then()
                .statusCode(200)
                .and()
                .assertThat()
                .body("size()", is(2))
                .body("name[0]", isA(String.class))
                .body("address[0]", isA(String.class))
                .body("name[1]", isA(String.class))
                .body("address[1]", isA(String.class));
    }

    @Test
    public void learners_LearnerController_validContentValues() {
        String namePattern = "^[a-zA-Z]{3,7}$";
        when().get(baseUrl + "learners").then()
                .statusCode(200)
                .and()
                .assertThat()
                .body("size()", is(2))
                .body("name[0]", matchesPattern(namePattern))
                .body("name[1]", matchesPattern(namePattern));
    }
}
