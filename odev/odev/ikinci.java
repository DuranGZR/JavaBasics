

public class ikinci {
	
	public static void secmeliSiralamaString(String[] str) {
		int diziBoyutu =  str.length;
		
		for ( int i = 0; i < diziBoyutu -1; i++) {
			int minIndex = i;
			
			for (int j = i+1 ; j < diziBoyutu; j++) {
				
				if ( str[j].compareTo(str[minIndex]) < 0) {
					minIndex = j;
				}
			}
		
		if (minIndex != i) {
			
			String gecici = str[i];
			str[i] = str[minIndex];
			str[minIndex] = gecici;
		}
		}
	}
	public static void main(String[] args) {
		
		String[] Isimler = {"kadir","ayşe","zeynep","mehmet","duran"};
		
		secmeliSiralamaString(Isimler);
		
		for(int i=0; i<Isimler.length;i++) {
			
		System.out.println(Isimler[i]);
		
		}
	}

}
