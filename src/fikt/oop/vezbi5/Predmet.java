package fikt.oop.vezbi5;

public class Predmet {
	public String predmet;
	public String profesor;
	public int krediti;
	public int semestar;
	
	public Predmet() {
		
	}
	
	public Predmet(String predmet) {
		this.predmet=predmet;
	}
	
	public Predmet(String predmet, String profesor, int krediti) {
		this.predmet=predmet;
		this.profesor=profesor;
		this.krediti=krediti;
	}
	
}
