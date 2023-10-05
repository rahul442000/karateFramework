package restAssured;

import org.testng.annotations.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;


public class SoapXMLRequestFromFile {

	@Test
	public void validateSoapXML() throws IOException {
		
		File file = new File("C:\\Users\\Rahul\\eclipse-workspace_1\\rahul\\src\\test\\java\\resources\\xmlRequest.xml");
		
		if(file.exists()) {
			System.out.println("<<File Exists>>");
		}
		FileInputStream xmlReq = new FileInputStream(file);
		
		String requestBody = IOUtils.toString(xmlReq, "UTF-8");
		
		baseURI = "https://www.dataaccess.com/";
		given()
			.contentType("text/xml; charset=utf-8")
			.accept(ContentType.XML)
			.body(requestBody)
		.when()
			.post("webservicesserver/NumberConversion.wso")
		.then()
			.statusCode(200)
			.log().all();
	}
	
}
