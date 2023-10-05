package restAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;;

public class JsonSchemaValitor {
	
	@Test
	public void getRequestAPI(){
		
		baseURI = "https://reqres.in/api";
		given()
		.when()
			.get("/users?page=2")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat().body(matchesJsonSchemaInClasspath("schema.json"));
	}

}
