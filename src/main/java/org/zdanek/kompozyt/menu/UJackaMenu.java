package org.zdanek.kompozyt.menu;

import java.util.Iterator;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class UJackaMenu implements Menu {
	
	Hashtable pozycjeMenu= new Hashtable();
	
	public UJackaMenu()
	{
		dodajElement("Kanapka wegetariańska z frytkami", "Kanapka wegetariańska z pomidorem i sałatą, frytki", true, 3.99);
		dodajElement("Zupa dnia", "Filiżanka zupy dnia, sałatka", false, 3.69);
		dodajElement("Burito", "Duże Burito z łaciatą fasolą, sosem salsa i guacamole (awokado)", false, 4.29);
	}
	
	public void dodajElement(String nazwa, String opis, boolean wegetariańska, double cena)
	{
		PozycjaMenu pozycjaMenu= new PozycjaMenu(nazwa, opis, wegetariańska, cena);
		pozycjeMenu.put(pozycjaMenu.pobierzNazwa(), pozycjaMenu);
	}
	@Override
	public Iterator utwórzIterator() {
		
		return null;
	}

}
