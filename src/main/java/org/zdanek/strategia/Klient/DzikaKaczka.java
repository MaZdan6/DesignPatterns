package org.zdanek.strategia.Klient;

import org.zdanek.strategia.AlgorytmyKwakania.Kwacz;
import org.zdanek.strategia.AlgorytmyLatania.LatamBoMamSkrzydla;

public class DzikaKaczka extends Kaczka {

	
	//konstruktor
	public DzikaKaczka()
	{
		kwakanieInterface = new Kwacz();
		latanieInterface = new LatamBoMamSkrzydla();
	}
	
	
	@Override
	public void wyswietl() {
		// TODO Auto-generated method stub
		System.out.println("Jestem Prawdziwl Dzikl Kaczkl");
	}

}
