package fikt.oop.vezbi7;
import java.util.Scanner;

public class MainClass {
	private static Scanner myInput;

	public static void main (String[] args) {
		myInput = new Scanner( System.in );
		int a,b;
		double c;
		
		System.out.println("Vnesi ja stranata a na triagolnikot: ");
		a=myInput.nextInt();
		System.out.println("Vnesi ja stranata b na triagolnikot: ");
		b=myInput.nextInt();
		c=StrictMath.hypot(a, b);
		
		Triagolnik obj1 = new Triagolnik (a, b, c);
		
		System.out.println("Perimetarot na triagolnikot e: " + obj1.Perimetar()+ "cm");
		System.out.println("Plostinata na triagolnikot e: " + obj1.Plostina()+ "cm2");
		
	}
}