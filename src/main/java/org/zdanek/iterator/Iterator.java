package org.zdanek.iterator;

public interface Iterator {
	
	/**
	 * @return zwraca wartoœæ logiczn¹, sygnalizuj¹c¹, czy w pêtli iteracji znajduje siê wiêcej pozycji
	 */
	boolean hasNext();
	
	/**
	 * @return kolejny element z agregatu
	 */
	Object next();
}
