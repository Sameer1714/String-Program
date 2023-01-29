package Home;

public class CompareToIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="saM";
		
		String s2="SAm";
		
		System.out.println(s1.compareToIgnoreCase(s2));
		
		String s3=" DOM";
		
		String s4="ADOM";
		System.out.println(s3.compareToIgnoreCase(s4));
	}

}
