import java.util.Scanner;
import java.io.*;

public class randRead {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("OutRandFile.txt");
		Scanner inputFile = new Scanner(file);
		
		
		while (inputFile.hasNext()){
			
			double stuff = inputFile.nextDouble();
			System.out.println(stuff);
			}
		inputFile.close();
		
	}

}
