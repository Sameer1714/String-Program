package Home;

public class removeLeadingandTrailingSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=" sameer is good boy ";
		
		System.out.println(s);
		removerspace(s);
	}

	private static void removerspace(String s) {
		// TODO Auto-generated method stub
		System.out.println(s.trim());
	}

}
