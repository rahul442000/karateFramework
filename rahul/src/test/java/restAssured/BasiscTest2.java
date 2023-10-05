package restAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.payLoad;

public class BasiscTest2 {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		RequestSpecification req = RestAssured.given()
			.log().all()
			.queryParam("key", "qaclick123")
			.header("Accept","application/json")
			.header("Content-Type","application/json")
			.body(payLoad.addPlace());
		
		Response resp = req.when()
			.post("maps/api/place/add/json");
		
		ValidatableResponse valRes = resp.then()
			.assertThat()
			.statusCode(200)
			.body("scope", equalTo("APP"))
			.header("Server", "Apache/2.4.52 (Ubuntu)");
		
		System.out.println("API Execution Completed.");
		String fullResponse = valRes.extract().response().asString();
		System.out.println("API Response: " + fullResponse);
		JsonPath js = new JsonPath(fullResponse);
		String place_id = js.getString("place_id");
		System.out.println("Place ID : " + place_id);
		String status = js.getString("status");
		Assert.assertEquals(status, "OK");
		System.out.println("API Validation Completed.");
		
	}

}
