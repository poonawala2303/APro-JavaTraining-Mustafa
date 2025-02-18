package com.aurionpro.facade.model;

public class HotelReceptionFacader 
{
	public void getIndianMenu()
	{
		IHotel indHotel = new IndianHotel();
		IMenu menu = indHotel.getMenu();
		menu.displayMenu();
	}
	
	public void getItalianMenu()
	{
		IHotel italian = new ItalianHotel();
		IMenu menu = italian.getMenu();
		menu.displayMenu();
	}
	
	public void getChineseMenu()
	{
		IHotel chinese = new ChineseHotel();
		IMenu menu = chinese.getMenu();
		menu.displayMenu();
	}
}
