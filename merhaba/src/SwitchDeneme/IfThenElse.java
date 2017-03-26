package SwitchDeneme;
import java.util.Scanner;
public class IfThenElse {
public static void main(String[] args) {
Scanner oku = new Scanner(System.in);


int c,d;
c = oku.nextInt();
d = oku.nextInt();
int sonuc = (d==0) ? (c*d) :(c/d);
System.out.println(sonuc);

}}
