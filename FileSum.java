
import java.util.Scanner;
import java.io.*;
import java.util.Random;


public class FileSum {

    
    public static void main(String[] args) throws IOException
     {
       
        int maxNums;
        String filename;
        int number1;
       
        Scanner keyboard = new Scanner(System.in);
        //Get maxNum
        System.out.println("Enter the number of integers to be totaled: ");
        maxNums = keyboard.nextInt();
        // Consume remaining newline
        keyboard.nextLine();
        //Get filename
        System.out.println("Enter the filename: ");
        filename = keyboard.nextLine();
       
        //open file
        PrintWriter outputfile = new PrintWriter(filename);
       
        for(int i=1; i<=maxNums; i++)
        {
            Random randomNum = new Random();
            number1 = randomNum.nextInt();
            outputfile.println(number1);
           
        }
               
        outputfile.close();
       
       
       
               

    }

}







