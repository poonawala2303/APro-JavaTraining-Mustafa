package com.aurionpro.facade.model;

public class ItalianHotel implements IHotel {

	public IMenu getMenu() {
		return new ItalianMenu();
	}

}
