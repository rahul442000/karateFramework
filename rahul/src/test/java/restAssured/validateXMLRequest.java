package restAssured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static org.hamcrest.Matchers.*;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class validateXMLRequest {

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
			.and()
				.body("//*:ubiNum.text()", equalTo("five hundred "))
			.log().all();
	}
}
