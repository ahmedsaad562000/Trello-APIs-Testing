package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

import io.cucumber.java.en.Then;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class D02_Get_Orgs_step_def {
    String token = null;
    String baseurl = null;
    String key = null;


    public D02_Get_Orgs_step_def() {
        token = Hooks.token;
        baseurl = Hooks.baseUrl;
        key = Hooks.key;

    }

}
