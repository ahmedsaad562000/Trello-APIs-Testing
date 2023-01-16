package stepDefinitions;

import io.cucumber.java.en.And;
import io.restassured.RestAssured;

public class D04_Get_boards {

    @And("^Add \"(.*)\" to url$")
    public void add_to_url(String url_add)
    {
        RestAssured.basePath = url_add;
        Hooks.req_specs = RestAssured.given();
    }
}
