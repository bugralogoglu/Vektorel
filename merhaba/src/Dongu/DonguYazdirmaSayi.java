package Dongu;
import java.util.Scanner;
public class DonguYazdirmaSayi {
public static void main(String[] args) {
	Scanner oku = new Scanner (System.in);
	int x = 0, sayac;
	sayac = oku.nextInt();
	
	while (x<sayac){
		x++;
		if(sayac == 3)continue;
		System.out.print(x + " ");
	}
}
}
