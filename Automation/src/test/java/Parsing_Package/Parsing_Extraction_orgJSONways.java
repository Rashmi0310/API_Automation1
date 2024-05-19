// Parsing extraction types -- how to extract all the values of object and also how to extract all the keys then 
// their corresponding values 


package Parsing_Package;

import static io.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Parsing_Extraction_orgJSONways {
	
	public static void main(String[] args) {
		 
		Response res=
		 given()
		 .contentType(ContentType.JSON)
		 .when()
		 .get("http://localhost:3000/APIBatchStudents");
		
//		System.out.println("Status code is" + res.statusCode());
//		System.out.println("Response data is");
//		System.out.println(res.asString());


		
// -- How to extract all the values of the object in particular index. example I need to extract index 4 values.
// Take JsonArray then index start from object then take jsonObject 
		
		JSONArray js = new JSONArray(res.asString());
		JSONObject j = js.getJSONObject(4);
		//System.out.println(j);
		

		
		
//-- How to extract all keynames that we used in response
// there is a keyset method and we will store all keys in a set of string .
		
		Set<String>allkeys=j.keySet();
		//System.out.println(allkeys);
				
//-- now we need corresponding value of each key then use " each each loop " 
		for( String key : allkeys)
		{
			System.out.println(" key Name is"+key);
			System.out.println("key value is" + j.get(key));
		}
		


		
		
	}

}



