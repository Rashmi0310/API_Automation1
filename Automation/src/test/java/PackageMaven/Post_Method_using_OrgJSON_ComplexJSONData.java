// Post Method Using org.Json file ( Second Approach ) by complex JSON


package PackageMaven;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Post_Method_using_OrgJSON_ComplexJSONData {
	
	public static void main(String[] args) {
		
// Our jSon format starts with Curly braces ( object) then need to create the object of JSONObject and use that in body.
		JSONObject inner = new JSONObject();
		inner.put("java", "path");
		inner.put("node.js", "path");
		
		
        JSONObject outer = new JSONObject();
        outer.put("firstname", "Test");
        outer.put("lastname", "Data");
        outer.put("id", "ApiAutomation");
        outer.put("PathVariables", inner);
        
                Response res=
        		given()
        		.contentType(ContentType.JSON)
        		.body(outer.toString())
        		.when()
        		.post("http://localhost:3000/SeleniumBatchStudents");
        		
        		System.out.println(" Status Code is");
        		System.out.println(res.statusCode());
        		System.out.println(" Response data is");
        		System.out.println(res.asString());
        
		
	}

}
