package Home;

public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="SameeR";
		
		String s2="SAMeer";
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s2.toLowerCase());
		
		
		StringBuffer sb=new StringBuffer("sameer");
		
		System.out.println(sb);
		
		System.out.println(sb.delete(0, 3));
		
		System.out.println(sb.deleteCharAt(1));
		
		System.out.println(sb.insert(1,"as"));
	}

}
