package Dongu;

import java.util.Scanner;

public class ForBuyukBulma {
public static void main(String[] args) {
Scanner oku = new Scanner (System.in);
int max = 0,y;
	for (;;){
			y = oku.nextInt();
			if (y > max)
				max = y;
			
			else if (y == 0)
				break;}
System.out.println(max);}}
