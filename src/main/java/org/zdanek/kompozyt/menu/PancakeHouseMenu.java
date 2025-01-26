package org.zdanek.kompozyt.menu;

import java.util.ArrayList;
import java.util.Iterator;


public class PancakeHouseMenu  implements Menu
{	
	ArrayList pozycjeMenu;
	
	//Konstruktor
	public PancakeHouseMenu()
	{
		pozycjeMenu = new ArrayList();
		
		dodajElement("Sniadanie nalesnikowe K&B", "Nalesniki z jajecznica i tostem", true, 2.99);
		dodajElement("Sniadanie nalesnikowe zwykle", "Nalelniki z jajkiem sadzonym i kielbasa", false, 2.99);
		dodajElement("Nalesniki z jagodami", "Nalesniki ze swerzymi jagodami", true, 3.49);
		dodajElement("Wafle nadziewane", "Wafle z jagodami lub truskawkami", true, 3.59);
	}
	
	public void dodajElement(String nazwa, String opis, boolean wegetarialska, double cena)
	{
		PozycjaMenu pozycjaMenu= new PozycjaMenu(nazwa, opis, wegetarialska, cena);
		pozycjeMenu.add(pozycjaMenu);
	}
	
	public ArrayList pobierPozycjeMenu()
	{
		return pozycjeMenu;
	}

	public Iterator utwlrzIterator() {
		// TODO Auto-generated method stub
		return pozycjeMenu.iterator();
	}
	
	
}
