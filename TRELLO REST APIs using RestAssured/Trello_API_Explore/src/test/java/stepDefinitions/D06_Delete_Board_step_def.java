package stepDefinitions;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class D06_Delete_Board_step_def {


    @When("Add Board ID")
    public void add_board_id()
    {
        String Board_ID = FileOperations.open_file(Hooks.Board_Id_file_name);
        RestAssured.baseURI =  RestAssured.baseURI +"/"+ Board_ID;
        Hooks.req_specs = RestAssured.given();
    }
}
