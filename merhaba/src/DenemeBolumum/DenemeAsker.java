package DenemeBolumum;

import java.util.Scanner;

public class DenemeAsker {
public static void	veriAl(){
	Scanner oku = new Scanner(System.in);
	System.out.println("Asker Kaç Günde Bir Nöbet Tutuyor:");
	int a = oku.nextInt();
	System.out.println("Ýlk Nöbeti(1-7) :");
	int b = oku.nextInt();
	System.out.println("Kaçýncý Nöbet:");
	int c = oku.nextInt();
	nobetHesapla(a,b,c);
}
public static void nobetHesapla(int a,int b,int c){
	int nobet = a * c + (b-1);
	nobet = nobet%7;
	ekranaYazdir(nobet,c);
}
public static void ekranaYazdir(int nobet,int c){
	if (nobet == 0)
	System.out.println("Asker " + c + ".inci nobetini Pazartesi günü tutar. ");
	else if (nobet == 1)
		System.out.println("Asker " + c + ".inci nobetini Salý günü tutar. ");
	else if (nobet == 2)
		System.out.println("Asker " + c + ".inci nobetini Çarþamba günü tutar. ");
	else if (nobet == 3)
		System.out.println("Asker " + c + ".inci nobetini Perþembe günü tutar. ");
	else if (nobet == 4)
		System.out.println("Asker " + c + ".inci nobetini Cuma günü tutar. ");
	else if (nobet == 5)
		System.out.println("Asker " + c + ".inci nobetini Cumartesi günü tutar. ");
	else if (nobet == 6)
		System.out.println("Asker " + c + ".inci nobetini Pazar günü tutar. ");
	else 
		System.out.println("Yanlýþ");
}
public static void main(String[] args) {
	
	veriAl();

	}

}
