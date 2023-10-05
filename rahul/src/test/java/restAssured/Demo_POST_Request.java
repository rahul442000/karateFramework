package restAssured;


import org.testng.annotations.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;



public class Demo_POST_Request {
	JSONObject request = new JSONObject();
	@BeforeClass
	public void postData() {
		
		//request.put("email",RestUtils.getEmail());
		//request.put("password",RestUtils.getPassword());
		
		request.put("email","eve.holt@reqres.in");
		request.put("password","pistol");
		
		baseURI ="https://reqres.in/";
		basePath = "/api/register";
	}
	
	@Test
	public void postRequestAPI(){
		
		given()
			.contentType("application/json")
			.body(request.toJSONString())
		.when()
			.post()
		.then()
			.statusCode(200)
			.body("id", equalTo(4))
			.and()
			.body("token", equalTo("QpwL5tke4Pnpja7X4"))
			.log().all();
	}

}
