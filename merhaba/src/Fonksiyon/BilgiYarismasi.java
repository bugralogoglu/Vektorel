package Fonksiyon;

import java.util.Scanner;

public class BilgiYarismasi {
	
	public static int soruSorInt() {
		System.out.println("5'in karesi nedir? ");
		int sonuc = (int) Math.pow(5, 2);
		return sonuc;
	}

	public static int cevapAl1Int() {
		Scanner oku = new Scanner(System.in);
		int c;
		return c = oku.nextInt();
	}

	public static String soruSorString() {
		System.out.println("T�rkiyenin ba�kenti neresidir?");
		String cevap = "Ankara";
		return cevap.toLowerCase();
	}
	public static String soruSor12String() {
		System.out.println("D�nyan�n en g�zel k�z�?");
		String cevap = "Beyza";
		return cevap.toLowerCase();
	}
	public static String cevapAl12String() {
		Scanner oku = new Scanner(System.in);
		String c = oku.nextLine();
		return c.toLowerCase();
	}

	
	public static String cevapAl1String() {
		Scanner oku = new Scanner(System.in);
		String c = oku.nextLine();
		return c.toLowerCase();
	}

	public static void main(String[] args) {

		int skor = 0;
		int cevap1SoruInt = soruSorInt();
		int cevap1 = cevapAl1Int();

		if (cevap1SoruInt == cevap1) {
			System.out.println("Do�ru");
			skor+=50;
		} else
			System.out.println("Yanl��");

		String cevap2String = soruSorString();
		String Cevapal11 = cevapAl1String();
		
		if (cevap2String.equals(Cevapal11)){
			System.out.println("Do�ru");
			skor+=20;}
		
		else
			System.out.println("Yanl��");
		
		
		String OrjCvpBugra = soruSor12String();
		String CvpBugra = cevapAl12String();
		
		if (OrjCvpBugra.equals(CvpBugra)){
			System.out.println("Do�ru");
			skor+=30;
		}
		else 
			System.out.println("Yanl�� Bu�ra olacakt�");
		System.out.println("Skorunuz: " + skor);
	}
}
