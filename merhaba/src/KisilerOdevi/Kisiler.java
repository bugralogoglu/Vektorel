package KisilerOdevi;

public class Kisiler {
	int Yas;
	int ID,DogumYili;
	String Isim;

	void Hesapla(){
		
		Yas = 2017 - DogumYili;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getDogumYili() {
		return DogumYili;
	}

	public void setDogumYili(int dogumYili) {
		DogumYili = dogumYili;
	}

	public String getIsim() {
		return Isim;
	}

	public void setIsim(String isim) {
		Isim = isim;
	}
}
