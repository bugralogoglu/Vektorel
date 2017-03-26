package Mat;

public class Topla {
	int sonuc = 0;

	Topla(int a, int b) {
		sonuc = a + b;
		System.out.println(sonuc);
	}

	Topla(int a, int b, int c) {
		sonuc = a + b + c;
		System.out.println(sonuc);
	}

	Topla(int array[]) {

		for (int i = 0; i <= 3; i++) {

			sonuc = array[i] + sonuc;
		}
		System.out.println(sonuc);

	}

	Topla(int array[], int array2[]) {

		for (int i = 0; i < array.length; i++) {
			sonuc = array[i] + sonuc;
		}
		
		for (int j = 0; j < array2.length; j++) {
			sonuc = array2[j] + sonuc;
		}
		
		
		System.out.println(sonuc);
	}

}
