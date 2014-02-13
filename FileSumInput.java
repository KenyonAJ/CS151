
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileSumInput {  // open class

        public static void main(String[] args) throws IOException { // open main()
        
        int number2; // accumulator feeder?
        double sum = 0; // accumulator
        String filename; // name of the textfile generated in FileSum
        Scanner keyboard = new Scanner(System.in); // create Scanner object
       
        System.out.println("Enter the file to read: "); // prompt user for name of file
        filename = keyboard.nextLine(); // name of textfile generated in FileSum (or wherever)
       
        File file = new File(filename); // links filename string to file object
        
        
        // look at this stuff later
        if (!file.exists()) { // open loop1
            
        	System.out.println("The file FiveRandomNumbers.txt does not exist.\nTry again");
            filename = keyboard.nextLine();}
            
       // else //  (file.exists()){ // open loop2
            	//break; // close loop2
            	// System.exit(0);
            //else {
            //   System.out.println("Chu crazy");}
        //} // close loop1
        
        // end look at this stuff later
        //open file for reading 
        Scanner inputFile = new Scanner(file); // links file object to scanner object
        //Read all of the values from the file and calculate their total. 
        while(inputFile.hasNext()) { // open while loop
            //Read a value from a file
            number2 = inputFile.nextInt();
            //System.out.println(inputFile.nextInt());  <---- here is your problem
            System.out.println(number2); // this is the fix
            //Add number to the sum
            sum += number2;
            System.out.println("The current total is " + sum);
        } // close while loop
        inputFile.close();
       
        System.out.println("The sum of the numbers is " + sum + ".");
    }

}