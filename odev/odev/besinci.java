

public class besinci {
	
	public static void reverse(char[] s, int index) {
		
		if ( index == s.length) {
			return;
		}
		
		reverse(s, index+1);
		
		System.out.print(s[index]);
		
	}
	
	public static void main(String[] args) {
		
		
		 char[] kelime = { 'M', 'a', 'l', 'a', 't', 'y', 'a' };
		 
		 reverse(kelime,0);
		 
		 
		
		
	}
}
