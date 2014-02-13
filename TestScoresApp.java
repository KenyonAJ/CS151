
public class TestScoresApp {

	
	public static void main(String[] args) {
		
		TestScores Andrew = new TestScores(100, 95, 91);
		String mean = Andrew.getMean();
		System.out.println("The current average is: " + mean);
		System.out.println("Oops, forgot to award extra credit and bonus points!");
		Andrew.setScore1(102);
		Andrew.setScore2(99);
		Andrew.setScore3(94);
		System.out.println("His new scores are: " + Andrew.getScore1() + ", " +
							Andrew.getScore2() + ", " + Andrew.getScore3());
		System.out.println("The new average is: " + Andrew.getMean());

	}

}
