// Parsing concept with single value(id) extraction and multiple values(id) of extraction 

package Parsing_Package;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Parsing_Single_Extract {
	
	public static void main(String[] args) {
		 
		Response res=
		 given()
		 .contentType(ContentType.JSON)
		 .when()
		 .get("http://localhost:3000/APIBatchStudents");
		
		//System.out.println("Status code is" + res.statusCode());
		//System.out.println("Response data is");
		//System.out.println(res.asString());

//--- This is how we can extract single value from object response. 
		
// our response starts with Array so take JsonArray from org.json. Put res.asString because it shows in string
		JSONArray js = new JSONArray(res.asString());
		
// Now we need to extract the id value of index 0 and it start from object so take JsonObject from org.Json
		//JSONObject j = js.getJSONObject(0);
		
// then what we want to print - id so get id with json object 
		//System.out.println(j.get("id"));

		
		
		
		
//-- This is how we can extract the multiple ids from the object response. 
		
// -- First we get to know the length of id of the js so 
		int L=js.length();
		for(int i=0 ;i<L ; i=i+1 )
		{
			JSONObject j = js.getJSONObject(i);
			System.out.println(j.get("id"));
		}


		
	}

}



