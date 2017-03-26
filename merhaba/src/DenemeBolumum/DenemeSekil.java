package DenemeBolumum;
import java.util.Scanner;
public class DenemeSekil {
private static Scanner oku;


private static void tanimla(){
	System.out.println("Ne cizdirmek istersiniz: (1- Kare 2-Üçgen 3-Ters Üçgen)");
	int b = oku.nextInt();
	System.out.println("Alan belirleyin: ");
	int c = oku.nextInt();
	switch(b){
	case 1: 
		kare(c);
		break;
	case 2: 
		ucgen(c);
		break;
	case 3:
		tersucgen(c);
		break;
	}
}

private static void kare(int a){
	for(int i = 1; i<=a;i++){
		for(int j = 1;j<=a;j++){
			System.out.print("* ");
		}
		System.out.println();
	}
}

private static void ucgen(int a){
	for(int i = 1; i<=a;i++){
		for(int j = 1; j<=i;j++){
			System.out.print("* ");	
		}
		System.out.println();
	}
}
private static void tersucgen(int a){
	for(int i = 1;a>=i;a--){
		for(int j = 1; j<=a;j++){
			System.out.print("* ");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		oku = new Scanner(System.in);
		tanimla();
	}

}
