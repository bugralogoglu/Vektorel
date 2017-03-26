package Fonksiyon;
public class ekranasekil {
public static void ekranaSekilBas(int sayi)
{
	for (int i = 1;i<=sayi;i++){
		System.out.print("*");
	}
	System.out.println();
}
public static void toplama(int sayi1,int sayi2){
	int sonuc = sayi1 + sayi2;
	System.out.println(sonuc);
}

public static void cikarma(int sayi1,int sayi2){
	int sonuc = sayi1 - sayi2;
	System.out.println(sonuc);
}

public static void carpma(int sayi1,int sayi2){
	int sonuc = sayi1 * sayi2;
	System.out.println(sonuc);
}

public static void main(String[] args) {
	ekranaSekilBas(6);
	toplama(4,5);
	cikarma(5,6);
	carpma(7,8);
	ekranaSekilBas(5);
	
}
}
