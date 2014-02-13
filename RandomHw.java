import java.util.Random;

public class RandomHw {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		System.out.println(rand.nextInt(11)); // 0 to 10
		System.out.println(rand.nextInt(501)); // 0 to 500
		System.out.println(rand.nextInt(10) + 1); // 1 to 10
		System.out.println(rand.nextInt(500) + 1); // 1 to 500
		System.out.println(rand.nextInt(26) + 25); // 25 to 50
		System.out.println(rand.nextInt(26) - 10); // -10 to 15
		

	}

}
