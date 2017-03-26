package Cevre;

public class Park {
	int agacSayisi;
	String ismi;
	
	public void setAgacSayi(int sayi){
		this.agacSayisi = sayi/2;
	}
	
	public void setIsmi(String isim){
		this.ismi = "15 Temmuz "+isim;
	}
	
	public int getAgacSayisi() {
		return agacSayisi;
	}
	
	public String getIsmi() {
		return ismi;
	}
	

}
