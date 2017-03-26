package YemeginDevami;

import Yemek.NusrEt;
import Yemek.RecepUsta;

public class Musteri {
	private int id = 332;
	RecepUsta hanibenimrecebim = new RecepUsta();
	NusrEt nusret = new NusrEt();

	void RecepUstayiAra() {
		System.out.println(hanibenimrecebim.masasayisi);
	}

	void NusretiAra() {
		System.out.println(nusret.garsonsayisi);
	}
}
