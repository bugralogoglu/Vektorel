package Saglik;

public class Hastane {

	public void ameliyat(Doktor doktor,Hemsire hemsire){
		System.out.println("Doktor ismi: " + doktor.name);
		System.out.println("Doktor tc: " + doktor.tc);
		
		System.out.println("Hemsire ismi: " + hemsire.name);
		System.out.println("Hemsire tc: " + hemsire.tc);

	}
	public void ameliyat(Doktor doktor){
		System.out.println("Doktor ismi: " + doktor.name);
		System.out.println("Doktor tc: " + doktor.tc);
		System.out.println();

	}
    
}
