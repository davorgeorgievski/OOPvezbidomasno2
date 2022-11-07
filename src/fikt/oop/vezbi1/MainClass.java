package fikt.oop.vezbi1;

public class MainClass {
	public static void main(String[] args) {
		Student object1 = new Student();
		object1.firstName="Стефан";
		object1.lastName="Стефановски";
		object1.index=2222;
		
		System.out.println("Податоци за прв објект: ");
		System.out.println(object1.firstName + " " + object1.lastName + " " + object1.index);
		
		Student object2 = new Student("Ангела","Ангелоска",3333);
		
		System.out.println("Податоци за втор објект: ");
		System.out.println(object2.firstName + " " + object2.lastName + " " + object2.index);
	}
}
