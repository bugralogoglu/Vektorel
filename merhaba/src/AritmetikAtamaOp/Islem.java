package AritmetikAtamaOp;

public class Islem {
public static void main(String[] args) {
	
	double sonuc = 10.4;
	
	sonuc += 5.12;
	int y = (int) sonuc;
	System.out.println(y);
	
	
	char cd = 'a';
	int b=1;
	b*=cd;
System.out.println(b);
	
String deneme = "selam";
System.out.println(deneme);

byte bitwseIlkIslem = 15;
byte bitwseIkinciIslem= 9;

System.out.println(bitwseIlkIslem&bitwseIkinciIslem);

System.out.println(bitwseIlkIslem|bitwseIkinciIslem);

System.out.println(bitwseIlkIslem^bitwseIkinciIslem);

}
}
