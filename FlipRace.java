
public class FlipRace {

	public static void main(String[] args) {
		
		int c1total = 0;
		int c2total = 0;
		int c1row = 0;
		int c2row = 0;
		boolean flag = false;
						
		Coin coin1 = new Coin();
		Coin coin2 = new Coin();
		
		// the coin constructor calls flip() upon initiation
		do {
			if (coin1.isHeads() == true){
				c1total++;
				c1row++;
				System.out.println("Coin 1 flip: HEAD!");
			}
			else {
				c1row = 0;
				System.out.println("Coin 1 flip: TAIL . . .");
			}
			
			if (coin2.isHeads() == true){
				c2total++;
				c2row++;
				System.out.println("Coin 2 flip: HEAD!");
			}
			else {
				c2row = 0;
				System.out.println("Coin 2 flip: TAIL . . .");
			}
			if (c1row == 3 || c2row == 3){
				
				if (c1row > c2row){
					System.out.println("Coin 1 is the winner, with a total of " + c1total + " flips.");
					flag = true;
				}
				if (c2row > c1row){
					System.out.println("Coin 2 is the winner, with a total of " + c2total + " flips.");
					flag = true;
				}
				if (c1row == c2row){
					System.out.println("We have a tie!");
					System.out.println("Coin 1 was flipped " + c1total + " times.");
					System.out.println("Coin 2 was flipped " + c2total + " times.");
					flag = true;
				}
			}
			coin1.flip();
			coin2.flip();
			
		} while (flag == false);
		

	} // close main()

} // close class
