package Dongu;

import java.util.Scanner;

public class ForCiftBul {
public static void main(String[] args) {
	Scanner oku = new Scanner (System.in);
	int kontrol = oku.nextInt();
		for (int x = kontrol;0 < x; x--){
			if (x % 2 == 0){
			System.out.print(x + " ");}
		}
	
		
}
}
