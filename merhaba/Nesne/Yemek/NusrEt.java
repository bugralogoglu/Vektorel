package Yemek;

public class NusrEt {
	private int id;
	public int masasayisi;
	public int garsonsayisi = 24;
	public int etmiktari = 30;

	public void etMiktariSorgula() {
		RecepUsta hanibenimrecebim = new RecepUsta();
		System.out.println(hanibenimrecebim.etmiktari);
	}
}
