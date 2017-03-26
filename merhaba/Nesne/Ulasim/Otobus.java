package Ulasim;

public class Otobus {
private String Model;
public String numara;
public int ayakYolcu;
public int oturanYolcu;
public int kapasite= 50;


int kacTaneYolcuAlabilir(){
	int veri = this.kapasite -  (this.ayakYolcu + this.oturanYolcu);
	return veri;
}

}
