package restAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.matcher.RestAssuredMatchers.matchesXsdInClasspath;;

public class xmlSchemaValidation {

	@Test
	public void xmlSchemaValidation() throws IOException {
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
			.and()
			.body("//*:ubiNum.text()", equalTo("five hundred "))
			.and()
			.assertThat().body(matchesXsdInClasspath("xmlSchema.xsd"))
			.log().all();
	}
}
