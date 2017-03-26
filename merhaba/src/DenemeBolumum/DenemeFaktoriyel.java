package DenemeBolumum;

import java.util.Scanner;

public class DenemeFaktoriyel {
	private static Scanner oku;

	public static void main(String[] args) {
		oku = new Scanner(System.in);
		System.out.println("Kaçýn faktöriyeli: ");
		int a = oku.nextInt();
		int sonuc = 1;
		for (int i = 1;i<=a;i++){
			sonuc = sonuc*i;
		}
		System.out.println(sonuc);

	}

}
