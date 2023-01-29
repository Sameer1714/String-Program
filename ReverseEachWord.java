package Home;

public class ReverseEachWord {
	public static void reverserWord(String s) {
		
		String temp="";
		//
		for(int i=s.length()-1;i>=0;i--) {
			temp+=s.charAt(i);
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Hello i am sameer domale";
		
		reverserWord(s);
	}

}
