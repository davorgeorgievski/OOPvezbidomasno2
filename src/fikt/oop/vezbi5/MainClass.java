package fikt.oop.vezbi5;

public class MainClass {
	public static void main(String[] args) {
		
		Predmet obj1 = new Predmet();
		obj1.predmet="Objektno orientirano programiranje";
		obj1.profesor="Ilija Jolevski";
		obj1.krediti=6;
		obj1.semestar=3;
		// Status na predmeti, ispisuvanje na koj profesor e po koj predmet, koj semestar i kolku krediti nosi predmetot.
		System.out.println("Status na predmeti od tret semestar");
		System.out.println("-------------------------------------------------------------"); // Pravime podelba so linija za da ima pogolema preglednost
		System.out.println("Profesor po predmetot " + obj1.predmet + " e " + obj1.profesor + ".");
		System.out.println("Predmetot e vo " + obj1.semestar + " semestar i nosi " + obj1.krediti + " krediti.");
		
		System.out.println("-------------------------------------------------------------"); // I tuka isto taka
		// Tuka go vnesuvame nasiot izboren predmet
		Predmet obj2 = new Predmet("Internet bankarstvo");
		System.out.println(obj2.predmet + " e izboren predmet.");
		
		System.out.println("-------------------------------------------------------------"); // I tuka isto taka
		// Tuka vnesuvame uste eden zadolzitelen predmet
		Predmet obj3 = new Predmet("Algoritmi i stukturi na podatoci","Violeta Manevska", 6);
		System.out.println("Profesor po predmetot " + obj3.predmet + " e " + obj3.profesor + " i nosi " + obj3.krediti + " krediti." );
	}
}
