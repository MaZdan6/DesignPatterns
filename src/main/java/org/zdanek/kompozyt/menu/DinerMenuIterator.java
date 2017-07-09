package org.zdanek.kompozyt.menu;


import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
	
	PozycjaMenu[] elementy;
	/**
	 * przechowuje indeks iterowanego elementu
	 */
	int pozycja=0;
	
	
	/**
	 * @param elementy - tablica pozycji menu, które bêd¹ iterowane
	 */
	public DinerMenuIterator( PozycjaMenu[] elementy){
		this.elementy= elementy;
	}
	

	@Override
	public boolean hasNext() {
		
		if(pozycja >= elementy.length || elementy[pozycja] == null){
			return false;
		}else{
			return true;
		}
		
	}

	@Override
	public Object next() {

		//zwraca kolejny element tablicy i zwiêksz wartoœæ zmiennej 'pozycja'
		PozycjaMenu pozycjaMenu= elementy[pozycja];
		pozycja++;
		
		return pozycjaMenu;
	}
	
	public void remove() {
		
		if(pozycja <=0)
		{
			throw new IllegalStateException("Nie mo¿esz usun¹æ elementu przed pierwszym wywo³aniem metody 'next()'");
		}
		
		//usuwanie elementu polega na przesuniêciu elementó o jedn¹ pozycjê
		if(elementy[pozycja-1] != null)
		{
			for(int i = pozycja-1; i<(elementy.length-1); i++)
			{
				elementy[i]= elementy[i+1];
			}
			elementy[elementy.length-1] = null;
		}
		
	}

}
