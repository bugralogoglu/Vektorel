import java.util.Scanner;

public class Vergi {
public static void main(String[] args) {
	Scanner oku = new Scanner (System.in);
	
	int kar,vergi;
	System.out.print("Karýnýzý girin: ");
	kar = oku.nextInt();
	
	if (kar >= 1000){
		System.out.print("Yüksek vergi uygulanýyor.Vergiyi girin: ");
		vergi = oku.nextInt();
		System.out.println(kar/vergi);
	}
	
	else if(kar >= 500){
		System.out.print("Orta vergi uygulanýyor.Vergiyi girin: ");
		vergi = oku.nextInt();
		System.out.println(kar/vergi);
	}
	else if(kar >= 0){
		System.out.print("Düþük vergi uygulanýyor.Vergiyi girin: ");
		vergi = oku.nextInt();
		System.out.println(kar/vergi);
	}
	
	else{
		System.out.println("Yanlýþ deðer girdiniz.");
		
	}
	
	
}
}
