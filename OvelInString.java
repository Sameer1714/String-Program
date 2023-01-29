package Home;

public class OvelInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="sameeer";
		
		
		for(int i=0;i<s.length()-1;i++)
		{
			char c,d=' ';
			if(s.charAt(i)=='a'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='e'||s.charAt(i)=='u')
			{
				 
				if(s.charAt(i)!=d) {
					   System.out.println(s.charAt(i));
					   d=s.charAt(i);
				   } 
			}
			
		}
		
		int[] arr= {10,2,30,2,45,4};
		int p=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==2||arr[i]==10) {
				if(p!=arr[i] )
				{	
				System.out.println(arr[i]);
				p=arr[i];
				}
			}
		}
		
		
	}

}
