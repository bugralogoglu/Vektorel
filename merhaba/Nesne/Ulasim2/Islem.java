package Ulasim2;

public class Islem {
	public static void main(String[] args) {
		koyYolu koyyolu = new koyYolu();
		Otoyol otoyol = new Otoyol();
		
		
		otoyol.setIsmi("E5");
		otoyol.setSeritSayi(5);
		otoyol.setTipi("Guzel yol");

		koyyolu.setIsmi("Corum yolu");
		koyyolu.setSeritSayi(2);
		koyyolu.setTipi("�irkin yol");

		System.out.println("Otoyol: ");
		System.out.print("H�z s�n�r�: ");
		otoyol.hizSiniri();
		System.out.print("Yol ismi: ");
		System.out.println(otoyol.getIsmi());
		System.out.print("�erit say�s�: ");
		System.out.println(otoyol.getSeritSayi());
		System.out.print("Yol tipi: ");
		System.out.println(otoyol.getTipi());

		System.out.println();
		System.out.println("K�y Yolu: ");
		System.out.print("H�z s�n�r�: ");
		koyyolu.hizSiniri();
		System.out.print("Yol ismi: ");
		System.out.println(koyyolu.getIsmi());
		System.out.print("�erit say�s�: ");
		System.out.println(koyyolu.getSeritSayi());
		System.out.print("Yol tipi: ");
		System.out.println(koyyolu.getTipi());

	}
}
