package org.zdanek.kompozyt.menu;

import java.util.Iterator;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class UJackaMenu implements Menu {
	
	Hashtable pozycjeMenu= new Hashtable();
	
	public UJackaMenu()
	{
		dodajElement("Kanapka wegetaria�ska z frytkami", "Kanapka wegetaria�ska z pomidorem i sa�at�, frytki", true, 3.99);
		dodajElement("Zupa dnia", "Fili�anka zupy dnia, sa�atka", false, 3.69);
		dodajElement("Burito", "Du�e Burito z �aciat� fasol�, sosem salsa i guacamole (awokado)", false, 4.29);
	}
	
	public void dodajElement(String nazwa, String opis, boolean wegetaria�ska, double cena)
	{
		PozycjaMenu pozycjaMenu= new PozycjaMenu(nazwa, opis, wegetaria�ska, cena);
		pozycjeMenu.put(pozycjaMenu.pobierzNazwa(), pozycjaMenu);
	}
	@Override
	public Iterator utw�rzIterator() {
		
		return null;
	}

}
