package Dongu;

import java.util.Scanner;

public class ForCarpimTablosu {
	public static void main(String[] args) {
	Scanner oku = new Scanner(System.in);
	for (int i = 1; i<10; i++){
		for (int j = 1; j<10;j++){
			System.out.println(i + " x " + j + " = " + (i*j));
		}
		System.out.println();
	}
}}
