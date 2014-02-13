import java.util.Random;

public class RandomNumbers {
	
	public static void main(String[] args) {
		
		int num1;
		double num2;
		
		Random generator = new Random();
		
		num1 = generator.nextInt(11) - 5;
		System.out.println(num1);
		
	}

}
