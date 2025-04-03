package reusableMethods;

import io.restassured.path.json.JsonPath;

public class JsonParse {

	
	public static JsonPath JsonParsing(String res) {
		JsonPath pathNew = new JsonPath(res);
		return pathNew;
	}
}
