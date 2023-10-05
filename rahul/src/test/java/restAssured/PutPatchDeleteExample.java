package restAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutPatchDeleteExample {

	@Test
	public void putAPI() {
		JSONObject request = new JSONObject();
		request.put("name","Rahul");
		request.put("job","Teacher");
		
		System.out.println(request.toJSONString());

		baseURI = "https://reqres.in/api";
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("/users/2").
		then().
			statusCode(200).
			log().all();
		
	}


	@Test
	public void patchAPI() {
		JSONObject request = new JSONObject();
		request.put("name","Rahul");
		request.put("job","Teacher");
		
		System.out.println(request.toJSONString());

		baseURI = "https://reqres.in/api";
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			patch("/users/2").
		then().
			statusCode(200).
			log().all();
		
	}

	@Test
	public void deleteAPI() {

		baseURI = "https://reqres.in/api";
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
		when().
			delete("/users/2").
		then().
			statusCode(204).
			log().all();
		
	}

}
