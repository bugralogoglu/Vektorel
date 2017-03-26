package Dongu;
import java.util.Scanner;
public class For {
public static void main(String[] args) {
	Scanner oku = new Scanner (System.in);
	int a;
	a = oku.nextInt();
	
	for (int y=0;y<a;y++){
		for (int x=1; x<a;x++){
		System.out.print("* ");
	}
		System.out.println("*");}
}

}
