// Get method by Api Automation


package PackageMaven;

import static io.restassured.RestAssured.*;

//import java.util.Set;

//import org.json.JSONArray;
//import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class MavenClassAPI {
	
	public static void main(String[] args) {
		 
		Response res=
		 given()
		 .contentType(ContentType.JSON)
		 .when()
		 .get("http://localhost:3000/APIBatchStudents");
		
		System.out.println("Status code is" + res.statusCode());
		System.out.println("Response data is");
		System.out.println(res.asString());


		
	}

}
