package Yemek;

public class RecepUsta {
	private int id;
	public int masasayisi = 13;
	public int garsonsayisi;
	public int etmiktari = 30;

	public void etMiktariSorgula() {
		NusrEt nusret = new NusrEt();
		System.out.println(nusret.etmiktari);
	}
}
