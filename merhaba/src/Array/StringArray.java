package Array;

import java.util.Scanner;

public class StringArray {
public static void ikiboyut(){
	Scanner oku = new Scanner(System.in);
	String a[][] = new String [2][2];
	for(int i = 0;i<=1;i++){
		for (int j = 0;j<=1;j++){
			a[i][j] = oku.nextLine();
		}
	}
}
	public static void main(String[] args) {
		ikiboyut();

	}

}
