package fikt.oop.vezbi4;

public class MainClass {
	public static void main(String[] args) {
		Avtomobil prv = new Avtomobil();
		prv.marka="BMW";
		prv.model="530D-F10";
		prv.km=92500;
		
		System.out.println(prv.marka + " " + prv.model + " " + prv.km);
	
		Avtomobil vtor = new Avtomobil("Citroen", "DS7", 55000);
		System.out.println(vtor.marka + " " + vtor.model + " " + vtor.km);
	}
}
