// pojo class - for simple , complex , array form of json

package PackageMaven;

import static io.restassured.RestAssured.*;

import java.net.http.HttpResponse.BodyHandler;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Post_Method_Using_POJO_Class_SimpleJSON {
	
	public static void main(String[] args) {
		Address_Info_ComplexJSON[] adr = new Address_Info_ComplexJSON[2];
		adr[0] = new Address_Info_ComplexJSON();
		adr[0].setFloor("7");
		adr[0].setHouseNo("298");
		adr[0].setStreetNo("2");
		
		adr[1] = new Address_Info_ComplexJSON();
		adr[1].setFloor("2nd");
		adr[1].setHouseNo("219");
		adr[1].setStreetNo("5");
		
		
		
		Basic_Info_Simple_Json basic = new Basic_Info_Simple_Json();
		basic.setDesignation("Tester");
		basic.setFirstname("John");
		basic.setLastname("Driver");
		basic.setId("9890");
		basic.setAddress(adr);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(basic)
		.when()
		.post("http://localhost:3000/APIBatchStudents");
		
		System.out.println("Status Code is");
		System.out.println(res.statusCode());
		System.out.println("Response Message is");
		System.out.println(res.asString());
		
		
	}

}
