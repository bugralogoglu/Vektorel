package KisilerOdevi;

public class Islem {

public static void main(String[] args) {
	Kisiler YeniKisi = new Kisiler();
	YeniKisi.setDogumYili(1996);
	YeniKisi.setID(123456);
	YeniKisi.setIsim("Bu�ra");
	YeniKisi.Hesapla();
	
	System.out.println("Isim: " + YeniKisi.Isim);
	System.out.println("ID: " + YeniKisi.ID);
	System.out.println("Ya�: " + YeniKisi.Yas);
}
}
