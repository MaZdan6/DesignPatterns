package org.zdanek.kompozyt.menu;

import java.util.Iterator;

public class DinerMenu implements Menu {
	
	static final int MAX_LICZBA_ELEMENTOW = 6;
	public int liczbaElementów = 0;
	PozycjaMenu[] pozycjeMenu;
	
	
	public DinerMenu()
	{
		
		pozycjeMenu= new PozycjaMenu[MAX_LICZBA_ELEMENTOW];
		dodajElement("Pizza", "opis pizzy", true, 2.99);
		dodajElement("Carbonara", "opis Carbonara", false, 1.29);
		dodajElement("Zupa", "opis zupy", true, 3.29);
		dodajElement("Hot-Dog", "opis Hot-Dog'a", false, 3.05);
	}
	
	public void dodajElement(String nazwa, String opis, boolean wegetariañska, double cena)
	{
		PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa, opis, wegetariañska, cena);
		
		if(liczbaElementów >= MAX_LICZBA_ELEMENTOW)
		{
			System.err.println("Niestety, menu jest pe³ne! Nie mo¿na dodaæ nowej pozycji!");
		}else
		{
			pozycjeMenu[liczbaElementów]= pozycjaMenu;
			liczbaElementów = liczbaElementów+1;
		}
	}
	
	public Iterator	 utwórzIterator() 
	{
		return new DinerMenuIterator(pozycjeMenu);
	}

}
