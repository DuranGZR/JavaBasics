

public class dorduncu {
	
	public static int gcd(int x , int y) {
		
		if ( y == 0) {
			return x;
		}
		
		return gcd(y , x%y);
	}
	
	
	
	public static void main(String[] args) {
		
		int x = 80;
		int y = 60;
		
		int obeb = gcd(x,y);
		
		System.out.println(obeb);
	}

}
