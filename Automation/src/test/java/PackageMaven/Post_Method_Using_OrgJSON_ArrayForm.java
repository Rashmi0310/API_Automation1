// Post Method Using org.Json file ( Second Approach ) by Array form


package PackageMaven;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured .*;

public class Post_Method_Using_OrgJSON_ArrayForm {
	
	public static void main(String[] args) {
		
	JSONObject inner1 =new JSONObject();
	inner1.put("H.NO", "219");
	inner1.put("Street", "2");
	
	JSONObject inner2 =new JSONObject();
	inner2.put("City", "Amritsar");
	inner2.put("State", "Punjab");
	
//if we use Array then use JSONArray
	JSONArray array = new JSONArray();
	array.put(0,inner1);
	array.put(1, inner2);
		
	JSONObject outer = new JSONObject();
	outer.put("name", "Prescott Donaldson");
	outer.put("email", "test@gmail.com");
	outer.put("phoneNumber", "456-768-8765");
	outer.put("id", "56");
	outer.put("Address" , array);
	
	Response res=
    		given()
    		.contentType(ContentType.JSON)
    		.body(outer.toString())
    		.when()
    		.post("http://localhost:3000/APIBatchStudents");
    		
    		System.out.println(" Status Code is");
    		System.out.println(res.statusCode());
    		System.out.println(" Response data is");
    		System.out.println(res.asString());
	

	}

}
