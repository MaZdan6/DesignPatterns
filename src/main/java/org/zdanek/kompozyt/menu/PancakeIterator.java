package org.zdanek.kompozyt.menu;

import java.util.ArrayList;

import org.zdanek.iterator.Iterator;

public class PancakeIterator implements Iterator {
	
	ArrayList<PozycjaMenu> elementy;
	/**
	 * przechowuje indeks iterowanego elementu
	 */
	int pozycja=0;
	
	public PancakeIterator(ArrayList<PozycjaMenu> elementy) {
		this.elementy = elementy;
	}

	@Override
	public boolean hasNext() {
		if(pozycja >= elementy.size() || elementy.get(pozycja) == null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public Object next() {
		//zwraca kolejny element tablicy i zwiêksz wartoœæ zmiennej 'pozycja'
				PozycjaMenu pozycjaMenu= elementy.get(pozycja);
				pozycja++;
				
				return pozycjaMenu;
	}

}
