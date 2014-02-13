
public class cs151hw4p1 {

	public static void main(String[] args) {
		
		String stuff = "(860) 222-3344";
		
		Pnp x = new Pnp(stuff);
		
		System.out.println("Area code: " + x.GetAreaCode());
		System.out.println("Prefix: " + x.GetPrefix());
		System.out.println("Last four: " + x.GetLast4());
		
	}

}
