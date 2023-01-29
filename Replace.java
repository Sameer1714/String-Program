package Home;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="This is Demo";
		
		String d=s1.replace("is", "was");
		System.out.println("s1 as d :> "+d);
		
		
		String s2="sameer";
	
		System.out.println(s1.replace(s1,s2));
		
		System.out.println("s1 :> "+s1);
		
		String s3="domale";
		
		System.out.println(s3.replace("om", "sam"));
		
		System.out.println("s3 :> "+s3);
	}

}
