package SwitchDeneme;

import java.util.Scanner;

public class GunYaz {
public static void main(String[] args) {
	int b;
	Scanner oku = new Scanner(System.in);
	b = oku.nextInt();
	switch(b){
	case 1: System.out.println("Pazartesi");
	case 2: System.out.println("Sal�");
	case 3: System.out.println("�ar�amba");
	case 4: System.out.println("Per�embe");
	case 5: System.out.println("Cuma");
	case 6: System.out.println("Cumartesi");
	case 7: System.out.println("Pazar");
	break;
	default: System.out.println("Yanl�� veri girdiniz.");
		
		
	}
}
}
