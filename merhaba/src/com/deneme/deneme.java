package com.deneme;

import java.util.Scanner;
public class deneme {
public static void main(String[] args) {
	int a,b,c,sayac;
	Scanner oku = new Scanner(System.in);
	do{
		System.out.print("Bir islem giri niz: (1-Toplama 2-Çýkarma 3-Çarpma 4-Bölme) : ");
		
		c = oku.nextInt();
		System.out.print("Sayi1: ");
		a = oku.nextInt();
		System.out.print("Sayi2: ");
		b = oku.nextInt();
		
		if (c == 1){
			System.out.print(a + " + " + b + " = ");
			System.out.println( a + b );}
		
		else if (c == 2){
			System.out.print(a + " - " + b + " = ");
			System.out.println(a - b);}
		
		else if (c == 3){
			System.out.print(a + " * " + b + " = ");
			System.out.println(a * b);}
		
		else if (c == 4){
						if(b == 0){
							System.out.println("Payda sýfýr olamaz.");}
						
						
						else{
							System.out.println(a + " / " + b + " = " + a/b);
							System.out.println("Bolumden kalan = " + a%b);}
						}
		else
			System.out.println("Yanlýþ iþlem giriþi yaptýnýz.");
	
		
		System.out.print("Çýkmak için 0, devam etmek için herhangi bir sayýya basýn: ");
		sayac = oku.nextInt();
	}while (sayac != 0);
	if (sayac == 0){
		System.out.println("Program kapatýlýyor...");
	}
	}}
