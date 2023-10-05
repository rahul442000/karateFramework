package restAssured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import files.payLoad;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

public class BasiscTest3 {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		System.out.println("Post API Execution Starting.");
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
			.statusCode(200);
		
		System.out.println("Post API Execution Completed.");
		String fullResponse = valRes.extract().response().asString();
		System.out.println("Post API Response: " + fullResponse);
		JsonPath js = new JsonPath(fullResponse);
//		
//		To find the length of array from the response
//		int count  = js.getInt("courses.size()");
//		
//		To print the all values for that particular field in array
//		for (int i = 0;i<count;i++) {
//			System.out.println(js.get("courses["+i+"].title"));
//		}
		
		String place_id = js.getString("place_id");
		System.out.println("Place ID : " + place_id);
		String status = js.getString("status");
		Assert.assertEquals(status, "OK");
		System.out.println("Post API Validation Completed.");
		
		
		// PUT API Execution
		System.out.println("PUT API Execution Starting.");
		String newAddress = "70 winter walk, USA";
		
		given()
			.log().all()
			.queryParam("key", "qaclick123")
			.header("Content-Type","application/json")
			.body(payLoad.updatePlace(place_id, newAddress))
		.when()
			.put("/maps/api/place/update/json")
		.then()
		.assertThat().log().all()
			.statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		System.out.println("PUT API Execution Completed.");
		
		
		// GET API Execution
		System.out.println("GET API Execution Starting.");
		RequestSpecification getReq = RestAssured.given()
			.log().all()
			.queryParam("place_id", place_id)
			.queryParam("key", "qaclick123");
		Response getResp = getReq.when()
			.get("/maps/api/place/get/json");
		ValidatableResponse valGetRes = getResp.then()
				.assertThat()
				.statusCode(200).log().all();
		
		String getActualRes = valGetRes.extract().response().asString();
		JsonPath js1 = new JsonPath(getActualRes);
		String actualResponse = js1.getString("address");
		System.out.println("Actual Address : "+ actualResponse );
		Assert.assertEquals(newAddress,actualResponse);
		System.out.println("GET API Execution Completed.");				
		System.out.println("End to End testing Completed. Status: Green");				
		
	}

}

