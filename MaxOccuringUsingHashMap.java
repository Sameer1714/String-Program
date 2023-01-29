package Home;

import java.util.HashMap;

public class MaxOccuringUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="sameer is very dangerous";
		s=s.replaceAll("\\s", "");
		
		System.out.println(s);
		
		char[] ch=s.toCharArray();
		
		HashMap<Character, Integer> hm=new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			
			if(hm.containsKey(ch[i])) {
				
				hm.put(ch[i],hm.get(hm)+1);
			}
			else {
				hm.put(ch[i],1);
			}
			
		}
		
	   
		
	}

}
