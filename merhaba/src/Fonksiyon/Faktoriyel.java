package Fonksiyon;
import java.util.Scanner;
public class Faktoriyel {
public static int faktoriyel(int a){
	int sonuc = 1;
	for (int i = 1; i<=a;i++){
		sonuc = sonuc * i;}
	return sonuc;
}
public static void main(String[] args) {
	Scanner oku = new Scanner (System.in);
	int fak = oku.nextInt();
	int y = faktoriyel(fak);
	
	System.out.println(fak + "! = " + y);
}

}
