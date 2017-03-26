package Dongu;
import java.util.Scanner;
public class DoWhile {
public static void main(String[] args) {
	Scanner oku = new Scanner(System.in);
	
	System.out.print("Büyük sayýyý girin: ");
	int x= oku.nextInt();
	System.out.print("Küçük sayýyý girin: ");
	int y= oku.nextInt();
	
	do {
		System.out.println(x);
		x--;}while(x>=y);

	
}
}
