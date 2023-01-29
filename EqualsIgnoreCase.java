package Home;

public class EqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Sameer";
		
		String s2="SAMEER";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s3=" SAMEER";
		
		System.out.println(s1.equalsIgnoreCase("sameer"));
		
		
		System.out.println(s1.equalsIgnoreCase(s3));
	}

}
