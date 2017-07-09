package org.zdanek.kompozyt.menu;

import java.util.Iterator;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class UJackaMenu implements Menu {
	
	Hashtable pozycjeMenu= new Hashtable();
	
	public UJackaMenu()
	{
		dodajElement("Kanapka wegetariañska z frytkami", "Kanapka wegetariañska z pomidorem i sa³at¹, frytki", true, 3.99);
		dodajElement("Zupa dnia", "Fili¿anka zupy dnia, sa³atka", false, 3.69);
		dodajElement("Burito", "Du¿e Burito z ³aciat¹ fasol¹, sosem salsa i guacamole (awokado)", false, 4.29);
	}
	
	public void dodajElement(String nazwa, String opis, boolean wegetariañska, double cena)
	{
		PozycjaMenu pozycjaMenu= new PozycjaMenu(nazwa, opis, wegetariañska, cena);
		pozycjeMenu.put(pozycjaMenu.pobierzNazwa(), pozycjaMenu);
	}
	@Override
	public Iterator utwórzIterator() {
		
		return null;
	}

}
