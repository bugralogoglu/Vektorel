
package SwitchDeneme;

import java.util.Scanner;

public class Islem {
public static void main(String[] args) {
	Scanner oku = new Scanner(System.in);
	int a;
	System.out.print("��rencinin notunu girin: " );
	a = oku.nextInt();
	switch(a){
	case 1: System.out.println("Kald�");
	break;
	case 2: System.out.println("K�t� ge�ti");
	break;
	case 3: System.out.println("Fena de�il");
	break;
	case 4: System.out.println("Ge�tin");
	break;
	case 5: System.out.println("Supersin");
	break;
	default: System.out.println("Yanl�� giri� yapt�n�z.");
	}
	
	
}
}
