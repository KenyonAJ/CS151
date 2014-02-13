/** This should cover the following cases: name.length() > major.length() where the 
 *  difference between them is odd or even; major.length() > name.length() where the
 *  difference between them is odd or even; name.length() == major.length().  The 
 *  box should automatically adjust depending on the length of the longer string (name or 
 *  major).
 */

import java.util.Scanner;

public class cs151hw1a {

	public static void main(String[] args) {
		
		String name, major;
		int strLen, switch_num;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		name = keyboard.nextLine();
		name = name.toUpperCase();
		
		System.out.println("Please enter your major: ");
		major = keyboard.nextLine();
		
		strLen = name.length();
		if (major.length() > strLen) {
			strLen = major.length();
		}
		
		if (name.length() > major.length())
			switch_num = 1;
		else if (major.length() > name.length())
			switch_num = 2;
		else
			switch_num = 3;
		
		switch (switch_num){
			
		case 1:
			System.out.println(drawLine(strLen));
			System.out.printf("* %s *\n", name);
			int diff1 = name.length() - major.length();
			if (diff1%2 == 0)
				System.out.println("*" + p_space((diff1/2)) + major + p_space((diff1/2)) + "*");
			else if (diff1%2 != 0)
				System.out.println("*" + p_space((diff1/2)) + major + p_space((diff1/2)) + " *");
			System.out.println(drawLine(strLen));
			break;
			
		case 2:
			System.out.println(drawLine(strLen));
			int diff2 = major.length() - name.length();
			if (diff2%2 == 0)
				System.out.println("*" + p_space((diff2/2)) + name + p_space((diff2/2)) + "*");
			else
				System.out.println("*" + p_space(diff2/2) + name + p_space(diff2/2) + " *");
			System.out.printf("* %s *\n", major);
			System.out.println(drawLine(strLen));
			break;
			
		case 3:
			System.out.println(drawLine(strLen));
			System.out.printf("* %s *\n", name);
			System.out.printf("* %s *\n", major);
			System.out.println(drawLine(strLen));
			break;
		} // close switch
		
	} // close main()
	
	public static String drawLine(int n){
		String line = "*";
		for (int i = 0; i <= (n+2); i++){
			line += "*";
		}
		return line;
	} // close drawLine()
	
	public static String p_space(int n){
		String space = " ";
		for (int i = 0; i <= (n-1); i++){
			space += " ";
		}
		return space;
	} // close p_space()
	
} // close class

