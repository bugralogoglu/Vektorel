package com.deneme;

import java.util.Scanner;
public class deneme {
public static void main(String[] args) {
	int a,b,c,sayac;
	Scanner oku = new Scanner(System.in);
	do{
		System.out.print("Bir islem giri niz: (1-Toplama 2-��karma 3-�arpma 4-B�lme) : ");
		
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
							System.out.println("Payda s�f�r olamaz.");}
						
						
						else{
							System.out.println(a + " / " + b + " = " + a/b);
							System.out.println("Bolumden kalan = " + a%b);}
						}
		else
			System.out.println("Yanl�� i�lem giri�i yapt�n�z.");
	
		
		System.out.print("��kmak i�in 0, devam etmek i�in herhangi bir say�ya bas�n: ");
		sayac = oku.nextInt();
	}while (sayac != 0);
	if (sayac == 0){
		System.out.println("Program kapat�l�yor...");
	}
	}}
