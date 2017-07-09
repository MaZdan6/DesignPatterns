package org.zdanek.strategia.Klient;

import org.zdanek.strategia.AlgorytmyKwakania.Kwacz;
import org.zdanek.strategia.AlgorytmyLatania.LatamBoMamSkrzyd³a;

public class DzikaKaczka extends Kaczka {

	
	//konstruktor
	public DzikaKaczka()
	{
		kwakanieInterface = new Kwacz();
		latanieInterface = new LatamBoMamSkrzyd³a();
	}
	
	
	@Override
	public void wyswietl() {
		// TODO Auto-generated method stub
		System.out.println("Jestem Prawdziw¹ Dzik¹ Kaczk¹");
	}

}
