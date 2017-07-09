package org.zdanek.kompozyt.menu;

import java.util.Hashtable;
import java.util.Iterator;


public class UJackaMenu implements Menu {
	
	Hashtable pozycjeMenu= new Hashtable();
	
	public UJackaMenu()
	{
		dodajElement("Kanapka wegetarialska z frytkami", "Kanapka wegetarialska z pomidorem i salatl, frytki", true, 3.99);
		dodajElement("Zupa dnia", "Fililanka zupy dnia, salatka", false, 3.69);
		dodajElement("Burito", "Dule Burito z laciatl fasoll, sosem salsa i guacamole (awokado)", false, 4.29);
	}
	
	public void dodajElement(String nazwa, String opis, boolean wegetarialska, double cena)
	{
		PozycjaMenu pozycjaMenu= new PozycjaMenu(nazwa, opis, wegetarialska, cena);
		pozycjeMenu.put(pozycjaMenu.pobierzNazwa(), pozycjaMenu);
	}
	@Override
	public Iterator utwlrzIterator() {
		
		return null;
	}

}
