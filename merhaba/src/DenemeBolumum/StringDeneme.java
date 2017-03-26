package DenemeBolumum;

import java.util.Scanner;

public class StringDeneme {
public static void main(String[] args) {
	
	Scanner oku = new Scanner (System.in);
	String a;
	int b,c;
	System.out.println("Isleminizi girin: ");
	b = oku.nextInt();
	a = oku.next();
	c = oku.nextInt();
	if(a.equals("+")){
		System.out.println("Cevap: " + (b+c));
	}
	
	else if(a.equals("-")){
		System.out.print("Cevap: " + (b-c));
		
}
	else if(a.equals("*")){
		System.out.println("Cevap: " + (b*c));
	}
	
	else if (a.equals("/")){
		if (c != 0){
		System.out.println("Cevap: " + (b/c));
		System.out.println("Kalan: " + (b%c));
		}
		else 
		System.out.println("Bolen 0 olamaz.");
	}
	else
		System.out.println("Yanlýþ iþlem giriþi yaptýnýz."); 
}
}
