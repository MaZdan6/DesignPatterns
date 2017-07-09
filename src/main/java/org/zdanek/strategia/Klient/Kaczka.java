package org.zdanek.strategia.Klient;

import org.zdanek.strategia.AlgorytmyKwakania.KwakanieInterface;
import org.zdanek.strategia.AlgorytmyLatania.LatanieInterface;

public abstract class  Kaczka {

	/*deklaruje dwie zmienne typu interfejsu dla poszczeg�lnych
	zachowa�. Wszystkie klasy podrz�dne superklasy Kaczka(w tym 
	samym pakiecie) b�d� dziedziczy�y te zmienne*/
	
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
	
	public void p�ywaj()
	{
		System.out.println("Wszystkie kaczki p�ywaj�, nawet te sztuczne");
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
