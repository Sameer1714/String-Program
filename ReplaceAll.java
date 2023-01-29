package Home;

public class ReplaceAll 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s="this is demo";
		
		System.out.println(s.replaceAll("is", "was"));
		
		System.out.println(s.replaceAll("is(.)", "was"));
		
		System.out.println(s.replaceAll("is(.*)", "was"));
	}

}
