package com.aurionpro.command.model;

public class OnCommand implements ICommand
{
	Television tv;
	
	public OnCommand(Television tv) 
	{
		this.tv = tv;
	}

	@Override
	public void execute() 
	{
		tv.on();
	}
	
}
