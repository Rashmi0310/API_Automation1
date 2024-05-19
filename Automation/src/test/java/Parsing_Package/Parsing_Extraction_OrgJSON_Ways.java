// Parsing Concept with how to extract the object of array and their key values and key names 
//--- using for loop and for each loop 


package Parsing_Package;

import static io.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Parsing_Extraction_OrgJSON_Ways {

	public static void main(String[] args) {
		 
		Response res=
		 given()
		 .contentType(ContentType.JSON)
		 .when()
		 .get("http://localhost:3000/APIBatchStudents");
		
//		System.out.println("Status code is" + res.statusCode());
//		System.out.println("Response data is");
//		System.out.println(res.asString());

		
// -- How can we extract all the object and their values of the array
		JSONArray js = new JSONArray(res.asString());
// use for loop 
		int L = js.length();
		for(int i=0 ; i<L ; i=i+1)
		{
			JSONObject j = js.getJSONObject(i);
			Set<String> allkeys = j.keySet();
			for(String key : allkeys)
			{
				System.out.println("key Name is " + key);
				System.out.println(" Key Value is" + j.get(key));
			}
		}
		
		

	}
}
