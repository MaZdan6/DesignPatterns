package org.zdanek.strategia.Klient;

import org.zdanek.strategia.AlgorytmyKwakania.KwakanieInterface;
import org.zdanek.strategia.AlgorytmyLatania.LatanieInterface;

public abstract class  Kaczka {

	/*deklaruje dwie zmienne typu interfejsu dla poszczególnych
	zachowañ. Wszystkie klasy podrzêdne superklasy Kaczka(w tym 
	samym pakiecie) bêd¹ dziedziczy³y te zmienne*/
	
	LatanieInterface latanieInterface;
	KwakanieInterface kwakanieInterface;
	
	
	public abstract void wyswietl();
	
	
	//Delegacja zachowania do odpowiedniej klasy
	
	public void wykonajLec()
	{
		latanieInterface.lec();
	}
	
	public void wykonajKwacz()
	{
		kwakanieInterface.kwacz();
	}
	
	public void p³ywaj()
	{
		System.out.println("Wszystkie kaczki p³ywaj¹, nawet te sztuczne");
	}
	
	
	//dynamiczne ustawianie zachowania
	public void ustawLatanieInterfejs (LatanieInterface li)
	{
		latanieInterface= li;
	}
	
	public void ustawKwakanieInterfejs (KwakanieInterface ki)
	{
		kwakanieInterface= ki;
	}
	
	
}
