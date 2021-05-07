import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Country {

	public static void main(String[] args) {
	
		Map<String, String> countryToCapitalMap = new HashMap<String, String>() {{
			// the keys are countries
			// values are the capitals
			put("Bulgaria", "Sofia");
			put("Turkey", "Ankara");
			put("Serbia", "Belgrade");
			put("Macedonia", "Skopje");
			put("Romania", "Bucharest");
			put("Greece", "Athens");
			put("New Zealand", "Auckland");
			put("Australia", "Canberra");
			put("Hunagry", "Budapest");
			put("Slovenia", "Ljubljana");	
		}};

		int points = 0; // collects the points
		
		System.out.println("Guess the capital of the country. "
				+ "Only contries with one single capital are included.");
		
		// create a list with the keys so that we can shuffle them 
		
		List<String> countries = new ArrayList(countryToCapitalMap.keySet());
		Collections.shuffle(countries); 
		
		Scanner sc = new Scanner(System.in);
		
		for (String country : countries) {  // Access keys/values in a random order
			System.out.println("What is the capital of " + country + " ?");
			String capital = sc.nextLine(); // keeps the input
			if (capital.equals(countryToCapitalMap.get(country))) { // compares the input and the right answer 
				points++;
			} else {
				points--;
			}
		}
		
		System.out.println("You have " + points + " points");
		
	}

}
