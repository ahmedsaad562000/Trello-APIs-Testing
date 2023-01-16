package stepDefinitions;

import Vars.Vars;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import io.restassured.RestAssured;

public class D03_Delete_Org_step_def {
    String token = null;
    String baseurl = null;
    String key = null;


    public D03_Delete_Org_step_def() {
        token = Hooks.token;
        baseurl = Hooks.baseUrl;
        key = Hooks.key;
    }

    @When("Add Organization ID")
    public void add_org_id()
    {
        RestAssured.baseURI =  RestAssured.baseURI +"/"+ Vars.get_Created_Org_ID();
        Hooks.req_specs = RestAssured.given();
    }

}
