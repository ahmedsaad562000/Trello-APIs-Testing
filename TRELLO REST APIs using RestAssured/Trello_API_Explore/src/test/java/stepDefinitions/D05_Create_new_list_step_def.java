package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;

public class D05_Create_new_list_step_def {

    @When("^Add List name \"(.*)\"$")
    public void Add_list_name(String List_name)
    {
        Hooks.req_specs.queryParam("name", List_name);
        String Board_id = FileOperations.open_file(Hooks.Board_Id_file_name);
        Hooks.req_specs.queryParam("idBoard" , Board_id);
    }


    @Then("Save id of the returned List")
    public void save_list_id()
    {
        JsonPath path = Hooks.response.jsonPath();
        String returned_id = path.get("id");
        FileOperations.Save_file(Hooks.List_Id_file_name , returned_id);
    }


}
