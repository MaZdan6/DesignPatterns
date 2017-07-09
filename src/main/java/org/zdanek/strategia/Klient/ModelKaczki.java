package org.zdanek.strategia.Klient;

import org.zdanek.strategia.AlgorytmyKwakania.Kwacz;
import org.zdanek.strategia.AlgorytmyLatania.LatamBoMamSkrzydła;

public class ModelKaczki extends Kaczka {

	
	//konstruktor
		public ModelKaczki()
		{
			kwakanieInterface = new Kwacz();
			latanieInterface = new LatamBoMamSkrzydła();
		}
		
		
	@Override
	public void wyswietl() {
		// TODO Auto-generated method stub
		 
		System.out.println("Jestem modelem kaczki");
	}

}
