import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class cs151hw6p1 {
	
	public static void main(String[] args) throws IOException {
		
		Random rand = new Random();
		int arb = rand.nextInt(100) + 1; // generates an arbitrary (1-100) length of numbers
		
		// create a file of arb length and populate with rand integers (1-50)
		PrintWriter outputFile = new PrintWriter ("gimmedat.txt");
		for (int i = 1; i <= arb; i++) {
			int tempRand = rand.nextInt(50) + 1;
			outputFile.println(tempRand);
		}
		outputFile.close();
		
		// create arraylist to hold values read from outputFile
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		
		// scan outputFile and store values in arrayList
		File inputFile = new File("gimmedat.txt");
		Scanner scan = new Scanner(inputFile);
		for (int j = 0; j < arb; j++) {
			intArray.add(new Integer(scan.nextInt()));
		}
		
		int[] numCount = new int[50];
		for (Integer num : intArray) {
			numCount[num -1] += 1;
		}
		for (int k = 0; k < 50; k++) {
			if (numCount[k] != 0)
				System.out.println(k+1 + ":\t " + numCount[k]);
		}
	}

}
