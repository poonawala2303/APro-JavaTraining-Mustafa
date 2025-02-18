package com.aurionpro.facade.test;

import com.aurionpro.facade.model.HotelReceptionFacader;

public class Hotel 
{
	public static void main(String[] args) 
	{
		
		HotelReceptionFacader hotel = new HotelReceptionFacader();
		
		hotel.getIndianMenu();
		hotel.getItalianMenu();
		hotel.getChineseMenu();
		
	}
}
