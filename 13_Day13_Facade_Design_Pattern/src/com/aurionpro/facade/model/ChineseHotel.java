package com.aurionpro.facade.model;

public class ChineseHotel implements IHotel 
{

	@Override
	public IMenu getMenu() {
		
		return new ChineseMenu();
	}

}
