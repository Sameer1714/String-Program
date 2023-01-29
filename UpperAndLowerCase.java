package Home;

public class UpperAndLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="sameer";
		
		String s2="SAMEER";
		
		ToUppercase(s);
		
		ToLowerCase(s2);
	}

	private static void ToLowerCase(String s2) {
		// TODO Auto-generated method stub
		System.out.println(s2.toLowerCase());
		
	}

	private static void ToUppercase(String s) {
		// TODO Auto-generated method stub
		System.out.println(s.toUpperCase());
	}

}
