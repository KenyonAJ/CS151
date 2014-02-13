import java.text.DecimalFormat;

public class TestScores {
	
	private double score1, score2, score3;
	
	// Constructor
	public TestScores(double a, double b, double c){
		score1 = a;
		score2 = b;
		score3 = c;
	} // close constructor
	// Setter methods
	public void setScore1(double x){
		score1 = x;
	} // close setScore1()
	public void setScore2(double x){
		score2 = x;
	} // close setScore2()
	public void setScore3(double x){
		score3 = x;
	} // close setScore3()
	// Getter methods
	public double getScore1(){
		return score1;
	} // close getScore1()
	public double getScore2(){
		return score2;
	} // close getScore2()
	public double getScore3(){
		return score3;
	} // close getScore3()
	public String getMean(){
		DecimalFormat df = new DecimalFormat("###.00");
		double mean = ((score1 + score2 + score3)/3);
		return df.format(mean);
	}

}
