package org.zdanek.kompozyt.main;

import java.util.Iterator;
import org.zdanek.kompozyt.menu.DinerMenu;
import org.zdanek.kompozyt.menu.Menu;
import org.zdanek.kompozyt.menu.PancakeHouseMenu;
import org.zdanek.kompozyt.menu.PozycjaMenu;

public class Kelnerka {

	
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	
	public Kelnerka(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void drukujMenu()
	{
		Iterator pancakeIterator= pancakeHouseMenu.utwórzIterator();
		Iterator dinerIterator= dinerMenu.utwórzIterator();
		
		System.out.println("MENU \n----\nŒniadania");
		drukujMenu(pancakeIterator);
		System.out.println("\nLunch");
		drukujMenu(dinerIterator);
	}
	
	public void drukujMenu(Iterator iterator)
	{
		while (iterator.hasNext()) {
			PozycjaMenu pozycjaMenu= (PozycjaMenu) iterator.next();
			System.out.print(pozycjaMenu.pobierzNazwa()+", ");
			System.out.print(pozycjaMenu.pobierzCena()+", ");
			System.out.println(pozycjaMenu.pobierzOpis()+", ");
		}
	}
}
