
import java.util.Random;
import java.io.*;

public class randHw {
	
	public static void main(String[] args) throws IOException {
		
		Random randomNumber = new Random();
		double rand1, rand2, rand3;
		
		rand1 = randomNumber.nextDouble();
		rand2 = randomNumber.nextDouble();
		rand3 = randomNumber.nextDouble();
		
		PrintWriter outputFile = new PrintWriter("OutRandFile.txt");
		
		outputFile.println(rand1);
		outputFile.println(rand2);
		outputFile.println(rand3);
		outputFile.close();
				
	}

}
