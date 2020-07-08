package pl.brunarski.restclient;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;

public class RestClient {
	
	
	
	public static void main(String []args) throws IOException {
		
		URL url = new URL("https://cat-fact.herokuapp.com/facts/random");
		
		InputStreamReader reader = new InputStreamReader(url.openStream());
		
		CatModel catmodel = new Gson().fromJson(reader,CatModel.class);
		System.out.print(catmodel.getText());
		
	}

}
