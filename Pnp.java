import java.util.StringTokenizer;

public class Pnp {
	
	private int ac, pfx, l4;
	
	public Pnp (){
		System.out.println("Nothing entered.");
	}
	
	public Pnp (String str){
		
		StringTokenizer st = new StringTokenizer(str, "() -");
		
		ac = Integer.parseInt(st.nextToken());
		pfx = Integer.parseInt(st.nextToken());
		l4 = Integer.parseInt(st.nextToken());
	}
	
	public int GetAreaCode () {
		return ac;
	}
	public int GetPrefix () {
		return pfx;
	}
	public int GetLast4 () {
		return l4;
	}

}
