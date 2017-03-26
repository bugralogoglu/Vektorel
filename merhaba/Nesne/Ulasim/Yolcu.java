package Ulasim;
import Ulasim.Otobus;
public class Yolcu {
int id;
public String name;


void hangiOtobustesin(Otobus otobus){
	System.out.println("Kac yolcu alabilir: " + otobus.kacTaneYolcuAlabilir());
}

}
