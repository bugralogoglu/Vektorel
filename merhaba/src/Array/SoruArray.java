package Array;

import java.util.Scanner;

public class SoruArray {

public static void main(String[] args) {
Scanner oku = new Scanner(System.in);
double array[] = new double[10];
for(int i =0;i<array.length;i++){
	array[i] = oku.nextDouble();}
	
for(int j = 0;j<array.length;j++){
	System.out.println(array[j]);
}

}}
