package SwitchDeneme;

import java.util.Scanner;

public class Barkod {
public static void main(String[] args) {
Scanner oku = new Scanner(System.in);

int yil,barkod;

System.out.print("Barkodu giriniz: ");
	barkod = oku.nextInt();
System.out.print("Y�l� giriniz: ");
	yil = oku.nextInt();
switch ("Java" + barkod + "-" + yil){
	case "Java20-2017":
		System.out.println("Hosgeldiniz");
		break;
	case "Java19-2016":
		System.out.println("S�n�f dolu ders ba�lad�");
		break;
	case "Java21-2018":
		System.out.println("Hen�z a��lmad�");
		break;
	default:
		System.out.println("Yanl�� giri�");
		break;
}

}}
