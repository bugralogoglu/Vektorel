package Fonksiyon;

import java.util.Scanner;

public class Yapilacak {
	public static int VeriAlFonksiyonu(int b) {
		Scanner oku = new Scanner(System.in);
		b = oku.nextInt();
		yonlendirici(b);
		return b;
	}

	public static void yonlendirici(int c) {
		if (ciftmi(c)) {
			System.out.println("Cift");
		} else if (tekmi(c)) {
			System.out.println("Tek");
		}
	}

	public static boolean tekmi(int c) {
		if (c % 2 == 1) {
			return true;
		} else
			return false;
	}

	public static boolean ciftmi(int b) {
		if (b % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		int a = 0;
		VeriAlFonksiyonu(a);
	}

}
