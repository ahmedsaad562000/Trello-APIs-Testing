package stepDefinitions;

import io.cucumber.java.en.When;
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
        String Org_ID = FileOperations.open_file(Hooks.Org_Id_file_name);
        RestAssured.baseURI =  RestAssured.baseURI +"/"+ Org_ID;
        Hooks.req_specs = RestAssured.given();
    }

}
