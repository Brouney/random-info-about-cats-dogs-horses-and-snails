package pl.brunarski.restclient;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;

public class RestClient {
	
	
	
	public static void main(String []args) throws IOException {
		
		URL urlcat = new URL("https://cat-fact.herokuapp.com/facts/random");
		
		InputStreamReader readercat = new InputStreamReader(urlcat.openStream());
		
		CatModel catmodel = new Gson().fromJson(readercat,CatModel.class);
		System.out.println("Random info about Cats:");
		System.out.println("\t"+catmodel.getText()+"\n");
		
		
		URL urldog = new URL("https://cat-fact.herokuapp.com/facts/random?animal_type=dog");
		
		InputStreamReader readerdog = new InputStreamReader(urldog.openStream());
		
		DogModel dogmodel = new Gson().fromJson(readerdog,DogModel.class);
		System.out.println("Random info about Dogs:");
		System.out.println("\t"+dogmodel.getText()+"\n");
		
		URL urlsnail = new URL("https://cat-fact.herokuapp.com/facts/random?animal_type=snail");
		
		InputStreamReader readersnail = new InputStreamReader(urlsnail.openStream());
		
		DogModel snailmodel = new Gson().fromJson(readersnail,DogModel.class);
		System.out.println("Random info about Snails:");
		System.out.println("\t"+snailmodel.getText()+"\n");
		
		
		URL urlhorse = new URL("https://cat-fact.herokuapp.com/facts/random?animal_type=horse");
		
		InputStreamReader readerhorse= new InputStreamReader(urlhorse.openStream());
		
		DogModel horsemodel = new Gson().fromJson(readerhorse,DogModel.class);
		System.out.println("Random info about Snails:");
		System.out.println("\t"+horsemodel.getText());
		
	}

}
