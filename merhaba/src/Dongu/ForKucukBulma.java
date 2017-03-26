package Dongu;
import java.util.Scanner;
public class ForKucukBulma {
	public static void main(String[] args) {
		Scanner oku = new Scanner (System.in);
		int min = 123098173,y;
			for (;;){
					y = oku.nextInt();
					if (y == 0)
						break;
					if (y < min)
						min = y;
					 }
		System.out.println(min);}
}
