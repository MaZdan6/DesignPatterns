package org.zdanek.iterator;

public interface Iterator {
	
	/**
	 * @return zwraca warto�� logiczn�, sygnalizuj�c�, czy w p�tli iteracji znajduje si� wi�cej pozycji
	 */
	boolean hasNext();
	
	/**
	 * @return kolejny element z agregatu
	 */
	Object next();
}
