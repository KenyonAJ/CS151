import java.util.Scanner;

public class cs151hw3p2 {
	
	public static void main(String[] args) {
	
		String str;
		int left, right;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a potential palindrome: ");
		str = keyboard.nextLine();
		str = str.toLowerCase();
		
		left = 0;
		right = str.length() - 1;
		
		while (str.charAt(left) == str.charAt(right) && left < right || str.charAt(left) != str.charAt(right)){
			if (str.charAt(left) >= 32 && str.charAt(left) <= 47){
				left++;
				continue;
			}
			if (str.charAt(right) >= 32 && str.charAt(right) <= 47){
				right--;
				continue;
			}
			if (str.charAt(left) == str.charAt(right)){
			left++;
			right--;
			}
			else
				break;
		}
		
		System.out.println();
		
		if (left < right)
			System.out.println("That string is NOT a palindrome.");
		else
			System.out.println("That string IS a palindrome.");
		
	}
	
}