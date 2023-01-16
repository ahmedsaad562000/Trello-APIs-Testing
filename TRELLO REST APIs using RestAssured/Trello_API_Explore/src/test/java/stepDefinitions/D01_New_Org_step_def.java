package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;

public class D01_New_Org_step_def {
    String token = null;
    String baseurl = null;
    String key = null;



    public D01_New_Org_step_def() {
        token = Hooks.token;
        baseurl = Hooks.baseUrl;
        key = Hooks.key;

    }



    @When("^Add Organization name \"(.*)\"$")
    public void add_displayName(String display_name) {
        Hooks.req_specs.queryParam("displayName", display_name);
    }

    @And("Add Token & Key")
    public void add_Token_Key() {
        Hooks.req_specs.header("Content-Type","application/json" ).header("Accept","application/json" );

        Hooks.req_specs.queryParam("key", key);
        Hooks.req_specs.queryParam("token", token);

    }




    @Then("Save id of the returned org")
    public void save_org_id()
    {
        JsonPath path = Hooks.response.jsonPath();
        String returned_id = path.get("id");
        FileOperations.Save_file(Hooks.Org_Id_file_name , returned_id);
    }



}
