package Parsing_Package;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;


import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Parsing_Extraction {

	
	public static void main(String[] args) {
		 
		Response res=
		 given()
		 .contentType(ContentType.JSON)
		 .when()
		 .get("http://localhost:3000/APIBatchStudents");
		
//		System.out.println("Status code is" + res.statusCode());
//		System.out.println("Response data is");
//		System.out.println(res.asString());

		
// --- How to extract the array from array 
		
		JSONArray js = new JSONArray(res.asString());
// array inside object so create JsonObject
		JSONObject j = js.getJSONObject(7);
// object inside array so create JsonArray
		JSONArray array = j.getJSONArray("Address");
// again array inside object so create JsonObject
		JSONObject jobj = array.getJSONObject(0);
		System.out.println(jobj.get("Street"));

		
		
	}

}
