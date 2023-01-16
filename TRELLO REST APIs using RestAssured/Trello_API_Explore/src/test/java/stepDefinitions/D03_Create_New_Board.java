package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;

public class D03_Create_New_Board {
   @When("^Add Board name \"(.*)\"$")
    public void Add_Board_name(String Board_name)
   {
       Hooks.req_specs.queryParam("name", Board_name);
       String Org_id = FileOperations.open_file(Hooks.Org_Id_file_name);
       Hooks.req_specs.queryParam("idOrganization" , Org_id);
   }

    @Then("Save id of the returned Board")
    public void save_board_id()
    {
        JsonPath path = Hooks.response.jsonPath();
        String returned_id = path.get("id");
        FileOperations.Save_file(Hooks.Board_Id_file_name , returned_id);
    }

}
