package restAssured;


import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;



public class Demo_GET_Request {
	
	@Test
	public void getRequestAPI(){
		
		given()
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.body("data[1].email", equalTo("lindsay.ferguson@reqres.in"))
			.assertThat().body("data[1].email", equalTo("lindsay.ferguson@reqres.in"));
	}

}
