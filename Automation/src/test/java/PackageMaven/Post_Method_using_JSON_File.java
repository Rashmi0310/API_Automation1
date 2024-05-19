// Post Method using JSON FILE ( First Approach)

package PackageMaven;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.json.JSONObject;
import org.json.JSONTokener;

import static io.restassured.RestAssured .*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Post_Method_using_JSON_File {

// Create Main Method
	public static void main(String[] args) throws FileNotFoundException {

// Create json file and then for read we need to create the object of " File" class and gave json file path
		File f = new File("../Automation/requestbody.json");
		
// Create the object of FileInputStream class and use that object in JSONTokener class. 	
		FileInputStream fi = new FileInputStream(f);

// add org.JSON dependency in POM file and create the object of " JSONTokener" and select "FileInputStream" then put the object of " FileInputStream" class 
		JSONTokener js = new JSONTokener(fi);

// Our jSon format starts with Curly braces ( object) then need to create the object of JSONObject and use that in body.
		JSONObject J = new JSONObject(js);
		
			
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(J.toString())
		 .when()
		.post("http://localhost:3000/APIBatchStudents");
		
		System.out.println(" Status Code is");
		System.out.println(res.statusCode());
		System.out.println("Response Data is");
		System.out.println(res.asString());
		
	
		
	}

}
