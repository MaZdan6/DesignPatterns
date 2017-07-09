package org.zdanek.strategia.strategyPattern;

import org.zdanek.strategia.AlgorytmyLatania.LotZNap�demRakietowym;
import org.zdanek.strategia.Klient.DzikaKaczka;
import org.zdanek.strategia.Klient.Kaczka;
import org.zdanek.strategia.Klient.ModelKaczki;

public class MiniSymulatorKaczki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kaczka dzika= new DzikaKaczka();
		dzika.wyswietl();
		dzika.wykonajKwacz();
		dzika.wykonajLec();

		
		Kaczka model= new ModelKaczki();
		model.wyswietl();
		model.wykonajLec();
		model.ustawLatanieInterfejs(new LotZNap�demRakietowym());
		model.wykonajLec();
		
	}

}
