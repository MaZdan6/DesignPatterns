package org.zdanek.strategia.Klient;

import org.zdanek.strategia.AlgorytmyKwakania.Kwacz;
import org.zdanek.strategia.AlgorytmyLatania.LatamBoMamSkrzyd³a;

public class ModelKaczki extends Kaczka {

	
	//konstruktor
		public ModelKaczki()
		{
			kwakanieInterface = new Kwacz();
			latanieInterface = new LatamBoMamSkrzyd³a();
		}
		
		
	@Override
	public void wyswietl() {
		// TODO Auto-generated method stub
		 
		System.out.println("Jestem modelem kaczki");
	}

}
