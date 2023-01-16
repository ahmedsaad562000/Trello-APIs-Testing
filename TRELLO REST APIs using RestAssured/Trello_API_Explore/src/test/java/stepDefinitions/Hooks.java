package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.asserts.SoftAssert;


public class Hooks {
    static String baseUrl = null;
    static String token = null;
    static String key = null;
    static String Org_Id_file_name = null;
    static String Board_Id_file_name = null;
    static String List_Id_file_name = null;
    static RequestSpecification req_specs = null;
    static Response response = null;

    @Before
    public static void initialize_Vars()
    {
        baseUrl = "https://api.trello.com";
        token = "ATTA303dab56867a222884cb70e5c2b9cd336ae19d4f5eb8f6d848e7bc8c121bbf17C6E6A63B";
        key = "69fb511ab6c28f5573ab10eab9045cc9";
        Board_Id_file_name = "Created_board_id.txt";
        Org_Id_file_name = "Created_org_id.txt";
        List_Id_file_name = "Created_list_id.txt";
    }

    @Given("^Add base path \"(.*)\"$")
    public void add_base_path(String base_path) {
        RestAssured.baseURI = baseUrl+base_path;

        req_specs = RestAssured.given();
    }

    @And("^Method = \"(.*)\"$")
    public void add_method(String given_method) {
        switch (given_method) {
            case "Post":
                response = req_specs.post();
                break;
            case "Get":
                response = req_specs.get();
                break;
            case "Delete":
                response = req_specs.delete();
                break;
            case "Put":
                response=req_specs.put();
            default:
                break;
        }
        response.prettyPrint();
    }

    @Then("Status_code is 200")
    public void status_code_check()
    {
        //create_org_resp.prettyPrint();
        int status_code = response.getStatusCode();
        System.out.println(status_code);
        RestAssured.basePath = "";
        RestAssured.baseURI = "";
        SoftAssert Soft_Assertion = new SoftAssert();
        Soft_Assertion.assertEquals(status_code , 200 , "Status code isn't 200");
        Soft_Assertion.assertAll();
    }



}

