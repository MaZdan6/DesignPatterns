package org.zdanek.kompozyt.menu;

import java.util.Iterator;

public class DinerMenu implements Menu {
	
	static final int MAX_LICZBA_ELEMENTOW = 6;
	public int liczbaElement�w = 0;
	PozycjaMenu[] pozycjeMenu;
	
	
	public DinerMenu()
	{
		
		pozycjeMenu= new PozycjaMenu[MAX_LICZBA_ELEMENTOW];
		dodajElement("Pizza", "opis pizzy", true, 2.99);
		dodajElement("Carbonara", "opis Carbonara", false, 1.29);
		dodajElement("Zupa", "opis zupy", true, 3.29);
		dodajElement("Hot-Dog", "opis Hot-Dog'a", false, 3.05);
	}
	
	public void dodajElement(String nazwa, String opis, boolean wegetaria�ska, double cena)
	{
		PozycjaMenu pozycjaMenu = new PozycjaMenu(nazwa, opis, wegetaria�ska, cena);
		
		if(liczbaElement�w >= MAX_LICZBA_ELEMENTOW)
		{
			System.err.println("Niestety, menu jest pe�ne! Nie mo�na doda� nowej pozycji!");
		}else
		{
			pozycjeMenu[liczbaElement�w]= pozycjaMenu;
			liczbaElement�w = liczbaElement�w+1;
		}
	}
	
	public Iterator	 utw�rzIterator() 
	{
		return new DinerMenuIterator(pozycjeMenu);
	}

}
