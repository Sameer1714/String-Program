package Home;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="sameer";
		
		String temp="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			temp=temp+s.charAt(i);	
	    }
	
		System.out.println(temp);
		
		if(s.equals(temp)) {
			System.out.println("it is pallindrome");
		}
		else
		{
			System.out.println("it is not pallindrome");
		}
	}

}
