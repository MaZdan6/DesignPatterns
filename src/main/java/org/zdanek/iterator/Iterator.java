package org.zdanek.iterator;

public interface Iterator {
	
	/**
	 * @return zwraca wartoll logicznl, sygnalizujlcl, czy w pltli iteracji znajduje sil wilcej pozycji
	 */
	boolean hasNext();
	
	/**
	 * @return kolejny element z agregatu
	 */
	Object next();
}
