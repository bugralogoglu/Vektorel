package KalitimMuhendis;

public class Islem {


	
	public static void main(String[] args) {
		InsaatMuhendisi imuhendis = new InsaatMuhendisi();
		BilgisayarMuhendisi bmuhendis = new BilgisayarMuhendisi();
		
		bmuhendis.mat();
		bmuhendis.yazilim();
		System.out.println();
		imuhendis.insaatbil();
		imuhendis.mat();
		System.out.println();
		imuhendis.setDiploma("Gazi �niversitesi");
		bmuhendis.setDiploma("Y�ld�r�m Beyaz�t �niversitesi");
		System.out.println(bmuhendis.getDiploma());
		System.out.println(imuhendis.getDiploma());
	}
	
}
