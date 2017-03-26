
package SwitchDeneme;

import java.util.Scanner;

public class Islem {
public static void main(String[] args) {
	Scanner oku = new Scanner(System.in);
	int a;
	System.out.print("Öðrencinin notunu girin: " );
	a = oku.nextInt();
	switch(a){
	case 1: System.out.println("Kaldý");
	break;
	case 2: System.out.println("Kötü geçti");
	break;
	case 3: System.out.println("Fena deðil");
	break;
	case 4: System.out.println("Geçtin");
	break;
	case 5: System.out.println("Supersin");
	break;
	default: System.out.println("Yanlýþ giriþ yaptýnýz.");
	}
	
	
}
}
