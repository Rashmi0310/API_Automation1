// Post Method Using org.Json file ( Second Approach ) by simple JSON

package PackageMaven;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured .*;

public class Post_Method_Using_Org_Json {
	
	public static void main(String[] args) {

// Our jSon format starts with Curly braces ( object) then need to create the object of JSONObject and use that in body.
        JSONObject js = new JSONObject();

// Add Data inside the JSON Data with the help of JSONObject object
		js.put("firstname", "Rashmi");
		js.put("lastname", "Mahajan");
		js.put("Designation", "STE");
		js.put("id", "Automation_API");
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(js.toString())
		.when()
		.post("http://localhost:3000/APIBatchStudents");
		
		System.out.println(" Status Code is");
		System.out.println(res.statusCode());
		System.out.println(" Response data is");
		System.out.println(res.asString());
		
		
	}

}
