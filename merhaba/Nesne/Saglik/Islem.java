package Saglik;

public class Islem {

	public static void main(String[] args) {
		Doktor doktor = new Doktor();
		Hemsire hemsire = new Hemsire();
		doktor.setName("Bugra");
		doktor.setTc(1234);
		hemsire.setName("Mehmet");
		hemsire.setTc(555555);

		Hastane ameliyat = new Hastane();
		Hastane ameliyat1 = new Hastane();
		ameliyat.ameliyat(doktor);
		ameliyat.ameliyat(doktor, hemsire);

	}

}
