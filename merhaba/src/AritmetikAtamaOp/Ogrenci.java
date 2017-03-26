package AritmetikAtamaOp;                        
import java.util.Scanner;
public class Ogrenci {
public static void main(String[] args) {
	Scanner oku = new Scanner(System.in);
	int ogrencinot;
	System.out.print("Notunu gir: ");
	ogrencinot = oku.nextInt();
	if (ogrencinot <= 100 && ogrencinot >=80){
			
		System.out.println("AA");}
	
	else if (ogrencinot < 80 && ogrencinot >=70){
			
		System.out.println("BB");}
	
	else if (ogrencinot < 70 && ogrencinot >=50){
		
		System.out.println("CC");}
	
	else if (ogrencinot < 50 && ogrencinot >=40){
		
		System.out.println("DD");}
	
	else if (ogrencinot < 40 && ogrencinot >=0){
		
		System.out.println("FF");}
	
	else 
		System.out.println("Yanlýþ");
	;}


}