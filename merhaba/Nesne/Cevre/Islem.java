package Cevre;

public class Islem {
	public static void main(String[] args) {
		Park parknesnesi = new Park();
		parknesnesi.setAgacSayi(1000);
		parknesnesi.setIsmi("Güven Park");
		
		
		
		
		System.out.println(parknesnesi.getAgacSayisi());
		System.out.println(parknesnesi.getIsmi());
		
		System.out.println();
		
		Park geziparki = new Park();
		geziparki.setAgacSayi(500);
		geziparki.setIsmi("Gezi Parkı");

	
		System.out.println(geziparki.getAgacSayisi());
		System.out.println(geziparki.getIsmi());
		}

	
}
