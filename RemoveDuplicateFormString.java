package Home;

import java.util.ArrayList;

public class RemoveDuplicateFormString 
{
	public static void RemoveDuplicate(String s) {
		
		String temp="";
		int flag=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					flag=1;
				    break;
				}
				else {
					flag=0;
				}
			}
			if(flag==0) {
				temp+=s.charAt(i);
			}
		}
		System.out.println(temp);
	}
	public static void main(String[] args){
		
		String s="Sameer";
		
		RemoveDuplicate(s);
		
		
	}
}
