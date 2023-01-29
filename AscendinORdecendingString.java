package Home;

import java.util.Arrays;

public class AscendinORdecendingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s= {"s","a","m","e","e","r"};
		Ascending(s);
		
	}

	private static void Ascending(String[] arr) {
		// TODO Auto-generated method stub
	
		
		
		String temp="";
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j].compareTo(arr[min])<0) {
					min=j;
				}
			}
			 temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(String d:arr) {
			System.out.print(d+"");
		}
 	}
}
