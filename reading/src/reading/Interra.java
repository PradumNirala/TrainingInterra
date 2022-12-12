package reading;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Interra {
	private static ArrayList<String> data = new ArrayList<String>();

	public static void main(String[] args) throws IOException {
		arrayListConstructor();
		// System.out.println(data);
	}

	public static void arrayListConstructor() throws IOException {
		
		
		File myObj = new File("C:/Users/Pradum Kumar Nirala/Downloads/testing.txt");
		int count = 0;
		Scanner myReader = new Scanner(myObj);
		
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			String[] parts = data.split("\\|",3);	
			
			 if(String.valueOf(parts[0]).equals(String.valueOf(parts[1])))
			 {
				 count++;	 
			 }
			 System.out.println(data);  	
		}
		
		System.out.println("the total number of lines" +count);
		
		myReader.close();
	}
}
