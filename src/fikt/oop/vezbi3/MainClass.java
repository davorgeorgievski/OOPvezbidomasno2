package fikt.oop.vezbi3;

public class MainClass {
	public static void main(String[] args) {
		Covek objekt = new Covek();
		objekt.ime="Petar";
		objekt.prezime="Dimitrovski";
		objekt.embg="110305440002";
		
		System.out.println("Imeto na covekot e: " + objekt.ime);
		System.out.println("Prezimeto na covekot e: " + objekt.prezime);
		System.out.println("Covekot ima maticen broj: " + objekt.embg);
	}
}
