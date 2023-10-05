package restAssured;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.payLoad;

public class BasiscTest {

	public static void main(String[] args) {
		
		baseURI = "https://rahulshettyacademy.com";
		given()
			.log().all()
			.queryParam("key", "qaclick123")
			.header("Accept","application/json")
			.header("Content-Type","application/json")
			.body(payLoad.addPlace())
		.when()
			.post("maps/api/place/add/json")
		.then()
			.assertThat()
			.statusCode(200)
			.body("scope", equalTo("APP"))
			.header("Server", "Apache/2.4.52 (Ubuntu)")
			.log().all();		
	}

}
