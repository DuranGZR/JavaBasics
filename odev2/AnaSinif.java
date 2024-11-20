
import java.util.Scanner;


public class AnaSinif {
	
	
	    private String ad;
	    private String soyad;
	    private int okulNo;
	
	
	
	
    public AnaSinif() {
        this.ad = "Bilinmiyor";
        this.soyad = "Bilinmiyor";
        this.okulNo = 0;
    }

    
    public AnaSinif(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        this.okulNo = 0;
    }

    public AnaSinif(String ad, String soyad, int okulNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.okulNo = okulNo;
    }
    public static void staticMetot() {
        int deger = 42; 
        System.out.println("Static metot değeri: " + deger);
    }

    public static void main(String[] args) {
        	
        staticMetot();
        
        IkinciSinif ikinciSınıf = new IkinciSinif();
        
        AnaSinif anaSinif = new AnaSinif();
        anaSinif.ikinciSinifDegerYazdir(ikinciSınıf);
        
        IkinciSinif[] ikinciSinifDizisi = new IkinciSinif[3];
        
        for (int i = 0; i < ikinciSinifDizisi.length; i++) {
            ikinciSinifDizisi[i] = new IkinciSinif();
        }
        
        
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ikinciSinifDizisi.length; i++) {
            System.out.println("Öğrenci " + (i + 1) + " için Sinif Değer 1, Sinif Değer 2 ve Sinif Değer 3 girin:");

            System.out.print("Sinif Değer 1 (int): ");
            int sinifDeger1 = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Sinif Değer 2 (String): ");
            String sinifDeger2 = scanner.nextLine();

            System.out.print("Sinif Değer 3 (float): ");
            float sinifDeger3 = scanner.nextFloat();

            
            ikinciSinifDizisi[i] = new AnaSinif().ikinciSinifaDegerAta(sinifDeger1, sinifDeger2, sinifDeger3);
        }

        
        AnaSinif anaSinif1 = new AnaSinif();
        for (IkinciSinif iks : ikinciSinifDizisi) {
            anaSinif1.ikinciSinifDegerYazdir(iks);
        }

        scanner.close();
    }
	
    
    public void ikinciSinifDegerYazdir(IkinciSinif iks) {
        System.out.println("Sinif Değer 1: " + iks.getSinifDeger1());
        System.out.println("Sinif Değer 2: " + iks.getSinifDeger2());
        System.out.println("Sinif Değer 3: " + iks.getSinifDeger3());
    }
    
    public IkinciSinif ikinciSinifaDegerAta(int sinifDeger1, String sinifDeger2, float sinifDeger3) {
        IkinciSinif iks = new IkinciSinif();
        iks.setSinifDeger1(sinifDeger1);
        iks.setSinifDeger2(sinifDeger2);
        iks.setSinifDeger3(sinifDeger3);
        return iks;
    }


	
  
}
