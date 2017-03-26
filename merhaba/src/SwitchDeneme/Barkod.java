package SwitchDeneme;

import java.util.Scanner;

public class Barkod {
public static void main(String[] args) {
Scanner oku = new Scanner(System.in);

int yil,barkod;

System.out.print("Barkodu giriniz: ");
	barkod = oku.nextInt();
System.out.print("Yýlý giriniz: ");
	yil = oku.nextInt();
switch ("Java" + barkod + "-" + yil){
	case "Java20-2017":
		System.out.println("Hosgeldiniz");
		break;
	case "Java19-2016":
		System.out.println("Sýnýf dolu ders baþladý");
		break;
	case "Java21-2018":
		System.out.println("Henüz açýlmadý");
		break;
	default:
		System.out.println("Yanlýþ giriþ");
		break;
}

}}
