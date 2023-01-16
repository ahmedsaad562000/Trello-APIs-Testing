package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class D07_Archive_UnArchive_List_step_def {
    @When("Add List ID")
    public void add_list_id()
    {
        String List_ID = FileOperations.open_file(Hooks.List_Id_file_name);
        RestAssured.baseURI =  RestAssured.baseURI +"/"+ List_ID;

    }

    @And("^Make value = \"(.*)\"$")
    public void add_Value(String value) {
        switch (value) {
            case "True":
                Hooks.req_specs.queryParam("value", true);
                break;
            case "False":
                Hooks.req_specs.queryParam("value", false);
                break;
            default:
                break;
        }
    }
}
