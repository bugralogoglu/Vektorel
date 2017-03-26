package Ulasim2;

public class Otoyol extends Yol {
	@Override
	void hizSiniri() {
		System.out.println(80);
	}

	public String getIsmi() {
		return ismi;
	}

	public void setIsmi(String ismi) {
		this.ismi = ismi;
	}

	public String getTipi() {
		return tipi;
	}

	public void setTipi(String tipi) {
		this.tipi = tipi;
	}

	public int getSeritSayi() {
		return seritSayi;
	}

	public void setSeritSayi(int seritSayi) {
		this.seritSayi = seritSayi;
	}
}
