package org.zdanek.kompozyt.main;

import org.zdanek.kompozyt.menu.DinerMenu;
import org.zdanek.kompozyt.menu.PancakeHouseMenu;
import org.zdanek.kompozyt.menu.PancakeIterator;

/**
 * @author Mateusz
 *
 */
public class MenuTest {

	public static void main(String[] args) {
		
		PancakeHouseMenu pancakeHouseMenu= new PancakeHouseMenu();
		DinerMenu dinerMenu= new DinerMenu();
		
		Kelnerka kelnerka= new Kelnerka(pancakeHouseMenu, dinerMenu);
		
		kelnerka.drukujMenu();

	}

}
