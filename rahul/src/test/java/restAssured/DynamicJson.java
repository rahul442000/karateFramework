package restAssured;


import files.payLoad;
import io.restassured.RestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class DynamicJson {
	
	@Test
	public void addBook() {
		 
		RestAssured.baseURI = "http://216.10.245.166";
		String resp = given()
			.log().all().header("Content-Type","application/json")
			.body(payLoad.addBook())
		.when()
			.post("/Library/Addbook.php")
		.then()
			.log().all()
			.assertThat().statusCode(200)
			.extract().response().asString();
		
		JsonPath js = new JsonPath(resp);
		String id = js.get("ID");
		System.out.println("Id: "+ id);
		
	}

}
