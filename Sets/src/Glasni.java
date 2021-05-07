import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Glasni {
	
	public static void main(String[] args) throws Exception {

		File file = new File ("src/zadacha23/Ball.java");		

		if (file.exists()) {
	System.out.println("The number of vowels is " + countVowels(file));
} else {
	System.out.println("File does not exis");
}

	}

	public static int countVowels (File file) throws Exception {
		String[] vowels = {"A", "O", "E", "I", "U", "a", "o", "e", "i", "u"};
		Set<String> vowelsSet = new HashSet<String>(Arrays.asList(vowels));
		int count = 0;
		
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			String word = sc.next();
			if (vowelsSet.contains(word)) {
				count++;
			}
		}
		return count;
	}
	
	
	
}
