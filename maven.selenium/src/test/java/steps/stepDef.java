package steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.*;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class stepDef {

	String BaseURI = "https://reqres.in";
	RequestSpecification req;
	Response res;
	ValidatableResponse validateRes;
	
//	@Test
//	public void GETAPI() {
//		String BaseURI = "https://reqres.in";
//		given().baseUri(BaseURI)
//		.when().get("/api/users?page=2")
//		.then().assertThat().statusCode(200)
//		.and().body("page", equalTo(2))
//		.log().all();
//		
//	}
		
	//Another Way
	@Given("I have GET API")
	public void i_have_get_api() {
		req = given().baseUri(BaseURI);
	}

	@When("I hit API with page value {int}")
	public void i_hit_api_with_page_value(Integer int1) {
		res = req.when().get("/api/users?page="+int1);
		
	}

	@Then("Status code comes as {int}")
	public void status_code_comes_as(Integer statusCode) {
		validateRes = res.then();
		validateRes.assertThat().statusCode(statusCode);
	}

	@Then("json bod contain page as {int}")
	public void json_bod_contain_page_as(Integer assertion) {
		validateRes.assertThat().body("page", equalTo(assertion));
		System.out.println("API Raw Response: ");
		validateRes.log().all();
	}


	
}
