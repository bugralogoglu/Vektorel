package Array;

import java.util.Scanner;

public class IkiBoyutluArray {

	public static void main(String[] args) {
		Scanner oku = new Scanner(System.in);
		int a[][] = new int[3][3];
		for(int i = 0;i<=2;i++){
			for (int j = 0;j<=2;j++){
				System.out.print("Array" + "[" + i + "][" + j + "] = ");
				a[i][j] = oku.nextInt();
			}
		}
		System.out.println();
		for(int i = 0;i<=2;i++){
			for (int j = 0;j<=2;j++){
				System.out.println("Array" + "[" + i + "][" + j + "] = " + a[i][j]);
			}
		}

}              }
