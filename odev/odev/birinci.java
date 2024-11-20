



public class birinci {
	
	public static void diziYaz(int[] dizi) {
		for (int sayı : dizi) {
			System.out.print(sayı+" ");
		}
		System.out.println();
	}
	
	public static int[] elemanEkle(int[] array,int yeni) {
		
		int[] yeniDizi = new int[array.length+1];
		
		for (int i = 0; i < array.length; i++) {
			yeniDizi[i] = array[i];
					
		}
		yeniDizi[array.length] = yeni;
				
		
		return yeniDizi;
		
	}
	public static int[] elemanSil(int[] array) {
		
		int[] yeniDizi = new int[array.length - 1];
		
		for (int i = 1;i < array.length; i++) {
			yeniDizi[i-1] = array[i];
		}
		
		return yeniDizi;
		
	}
	public static int diziElemanSay(int[] dizi,int aranan) {
		
		int sayac = 0;
		
		for (int i : dizi) {
			if (i == aranan) {
				sayac++;
			}
		}
		
		return sayac;
		
	}
	public static int[] diziArananElemanIndeks(int[] dizi,int aranan) {
		
		int sayac = diziElemanSay(dizi,aranan);
		
		int[] indeksler = new int[sayac];
		int index = 0;
		
		for (int i = 0; i< dizi.length; i++) {
			if ( dizi[i] == aranan) {
				indeksler[index++] = i;
			}
		}
		
		return indeksler;
		
	}
	
	
	
	
	
	
	
	
	// ARARMA GEZİNME
	
	
	
	public static void diziGezinme(int[] dizi) {
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
			
		}
	}
	
	public static void recDiziGezinme(int[] dizi , int index) {
		
		if (index >= dizi.length) {
			return;
		}
		System.out.print(dizi[index]+ " ");
		recDiziGezinme(dizi , index +1);
	}
	
	
	
	
	
	public static int diziAra(int[] dizi, int aranan) {
		
		for (int i= 0; i < dizi.length; i++) {
			if (dizi[i] == aranan) {
				return i;
			}
			
		}
		return -1;
	}
	
	
	public static int recDiziAra(int[] dizi, int aranan, int index) {
		
		if (index >= dizi.length) {
			return -1;
		}
		if (dizi[index] == aranan) {
			return index;
		}
		return recDiziAra(dizi,aranan,index+1);
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] dizi = {1,2,3,4,5,4,3,3,};
		
		diziYaz(dizi);
		
		dizi = elemanEkle(dizi,9);
		diziYaz(dizi);
		
		dizi = elemanSil(dizi);
		diziYaz(dizi);
		
		System.out.println();
		
		int aranan = 3;
		int tekrarSayisi = diziElemanSay(dizi,aranan);
		System.out.println(aranan + " sayısı "+ tekrarSayisi+ " kez tekrarlandı. ");
		
		int[] indexler = diziArananElemanIndeks(dizi,aranan);
		System.out.print(aranan + " sayısının bulunduğu indexler: ");
		diziYaz(indexler);
		
		
		System.out.println();
		System.out.println();
		
		diziGezinme(dizi);
		System.out.println();
		recDiziGezinme(dizi,0);
		
		
		
	}

}
