package org.zdanek.strategia.Klient;

import org.zdanek.strategia.AlgorytmyKwakania.Kwacz;
import org.zdanek.strategia.AlgorytmyLatania.LatamBoMamSkrzydla;

public class ModelKaczki extends Kaczka {

	
	//konstruktor
		public ModelKaczki()
		{
			kwakanieInterface = new Kwacz();
			latanieInterface = new LatamBoMamSkrzydla();
		}
		
		
	@Override
	public void wyswietl() {
		// TODO Auto-generated method stub
		 
		System.out.println("Jestem modelem kaczki");
	}

}
