package org.zdanek.kompozyt.menu;

public class PozycjaMenu 
{
	String nazwa, opis;
	boolean wegetarianska;
	double cena;
	
	//Konstruktor
	public PozycjaMenu(String nazwa, String opis, boolean wegetarianska, double cena)
	{
		this.nazwa = nazwa;
		this.opis= opis;
		this.wegetarianska= wegetarianska;
		this.cena= cena;
	}

	//gettery i settery
	public String pobierzNazwa() {
		return nazwa;
	}

	public String pobierzOpis() {
		return opis;
	}

	public boolean jestWegetarialska() {
		return wegetarianska;
	}

	public double pobierzCena() {
		return cena;
	}
	
	
}
