import java.util.Scanner;

class  cs151Lab2p3 {
	
	public static void main (String[] args){

	     Scanner scan = new Scanner (System.in);


	     System.out.print ("Enter a three digit number: ");
	
     System.out.flush();

	     int number = scan.nextInt();
	

     int hundreds = number / 100;

	     int tens = (number % 100) / 10;
	
     int ones = (number % 100) % 10;

	     int reverse = ones * 100 + tens * 10 + hundreds;
	

     System.out.println ("The original number is " + number);
	
     System.out.println ("The reverse number is " + reverse);


     }

}