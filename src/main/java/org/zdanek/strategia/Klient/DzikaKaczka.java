package org.zdanek.strategia.Klient;

import org.zdanek.strategia.AlgorytmyKwakania.Kwacz;
import org.zdanek.strategia.AlgorytmyLatania.LatamBoMamSkrzyd�a;

public class DzikaKaczka extends Kaczka {

	
	//konstruktor
	public DzikaKaczka()
	{
		kwakanieInterface = new Kwacz();
		latanieInterface = new LatamBoMamSkrzyd�a();
	}
	
	
	@Override
	public void wyswietl() {
		// TODO Auto-generated method stub
		System.out.println("Jestem Prawdziw� Dzik� Kaczk�");
	}

}
