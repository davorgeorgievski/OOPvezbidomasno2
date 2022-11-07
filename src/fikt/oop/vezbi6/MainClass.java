package fikt.oop.vezbi6;

public class MainClass {
	public static void main(String[] args) {
		Proizvod choko = new Proizvod("Chokolado", 100, 55);
		System.out.println("Cenata na " + choko.ime + "to " + "so tezhina od " + choko.tezina + "g" + " iznesuva " + choko.cena + " denari.");
		
	}
}
