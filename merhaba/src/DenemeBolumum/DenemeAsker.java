package DenemeBolumum;

import java.util.Scanner;

public class DenemeAsker {
public static void	veriAl(){
	Scanner oku = new Scanner(System.in);
	System.out.println("Asker Ka� G�nde Bir N�bet Tutuyor:");
	int a = oku.nextInt();
	System.out.println("�lk N�beti(1-7) :");
	int b = oku.nextInt();
	System.out.println("Ka��nc� N�bet:");
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
	System.out.println("Asker " + c + ".inci nobetini Pazartesi g�n� tutar. ");
	else if (nobet == 1)
		System.out.println("Asker " + c + ".inci nobetini Sal� g�n� tutar. ");
	else if (nobet == 2)
		System.out.println("Asker " + c + ".inci nobetini �ar�amba g�n� tutar. ");
	else if (nobet == 3)
		System.out.println("Asker " + c + ".inci nobetini Per�embe g�n� tutar. ");
	else if (nobet == 4)
		System.out.println("Asker " + c + ".inci nobetini Cuma g�n� tutar. ");
	else if (nobet == 5)
		System.out.println("Asker " + c + ".inci nobetini Cumartesi g�n� tutar. ");
	else if (nobet == 6)
		System.out.println("Asker " + c + ".inci nobetini Pazar g�n� tutar. ");
	else 
		System.out.println("Yanl��");
}
public static void main(String[] args) {
	
	veriAl();

	}

}
