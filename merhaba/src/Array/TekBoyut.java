package Array;

public class TekBoyut {
public static void main(String[] args) {
	

	int[] dizi = new int[5];
	
	for(int i = 0;i<dizi.length;i++){
	dizi[i] = (int) Math.pow(i, 3);
	System.out.println(dizi[i]);
	}
}
}
