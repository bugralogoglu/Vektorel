package HayvanlarAlemi;

public class Islem {
	public static void main(String[] args) {
		Goril goril = new Goril();
		System.out.println("Omurgal�y�m");
		goril.ureme();
		goril.iskelet();
		goril.hareket();
		goril.yuzmetrezipliyorum();
		
		System.out.println();

		System.out.println("Omurgas�z�m");
		Y�lan y�lan = new Y�lan();
		y�lan.ureme();
		y�lan.surungen();
		y�lan.omurgasizim();
		
		System.out.println();
		
		System.out.println("Omurgal�y�m");
		Maymun maymun = new Maymun();
		maymun.ureme();
		maymun.iskelet();
		maymun.hareket();
		maymun.ellimetreziplama();
		
		

	}
}
