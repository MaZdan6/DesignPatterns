package org.zdanek.strategia.Klient;

import org.zdanek.strategia.AlgorytmyKwakania.Kwacz;
import org.zdanek.strategia.AlgorytmyLatania.LatamBoMamSkrzyd�a;

public class ModelKaczki extends Kaczka {

	
	//konstruktor
		public ModelKaczki()
		{
			kwakanieInterface = new Kwacz();
			latanieInterface = new LatamBoMamSkrzyd�a();
		}
		
		
	@Override
	public void wyswietl() {
		// TODO Auto-generated method stub
		 
		System.out.println("Jestem modelem kaczki");
	}

}
