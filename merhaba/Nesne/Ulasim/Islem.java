package Ulasim;

public class Islem {

	public static void main(String[] args) {
		Otobus otobus = new Otobus();
		otobus.ayakYolcu = 15;
		otobus.numara = "20";
		otobus.oturanYolcu = 20;
		
		System.out.println("Otobus kapasitesi: " + otobus.kapasite);
		System.out.println("Ayakta yolcu: " + otobus.ayakYolcu);
		System.out.println("Oturan yolcu: " + otobus.oturanYolcu);
		System.out.println("Otobusun numarasý: " + otobus.numara);
		
		Yolcu yolcuFatmaTeyze = new Yolcu();
		yolcuFatmaTeyze.name = "Fatma";
		yolcuFatmaTeyze.hangiOtobustesin(otobus);
		
		System.out.println("Bu arada benim adým " + yolcuFatmaTeyze.name + " ben buranýn reisiyim");
	}

}

