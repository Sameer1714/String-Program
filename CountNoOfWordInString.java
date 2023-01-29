package Home;

public class CountNoOfWordInString {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		String s="hello i am sameer";
		CountWord(s);
	}

	private static void CountWord(String s) {
		// TODO Auto-generated method stub
		String s2=s.replaceAll(" ", "");
		
		System.out.println(s2.length());
		
	}

}
