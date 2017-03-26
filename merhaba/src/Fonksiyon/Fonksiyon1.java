package Fonksiyon;
import java.util.Scanner;
public class Fonksiyon1 {

	static void toplama(int c,int d){
		System.out.println(c+d);
	}
	static void cikarma(int c,int d){
		System.out.println(c-d);
	}
	static void carpma(int c,int d){
		System.out.println(c*d);
	}
	static void bolme(int c,int d){
		if (d != 0){
			System.out.println(c/d);
		}
		else
			System.out.println("Payda 0 olamaz");
	}
public static void main(String[] args) {
Scanner oku = new Scanner (System.in);

int a = oku.nextInt();
String c = oku.next();
int b = oku.nextInt();
switch (c){
case "+" :
	toplama(a,b);break;
case "-" :
	cikarma(a,b);break;
case "*" :
	carpma(a,b);break;
case "/" :
	bolme(a,b);break;
}



	}

}
