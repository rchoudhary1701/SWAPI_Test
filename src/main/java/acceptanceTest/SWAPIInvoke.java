package acceptanceTest;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class SWAPIInvoke {

    Response response;

    @Given("hit the API url with {string}")
    public void hit_the_api_url_with(String resource) {
        RestAssured.baseURI= "https://swapi.dev";


        response= RestAssured.given()
                .contentType("application/json")
                .basePath(resource).get();

    }


    @Then("validate the status code {int}")
    public void validate_the_status_code(int StatusCode) {
        int actualStatusCode= response.statusCode();
        Assert.assertEquals(StatusCode,actualStatusCode);

        if(actualStatusCode==StatusCode)
        {
            String responseBody=response.getBody().asString();
            System.out.println(responseBody);
        }
    }

}
