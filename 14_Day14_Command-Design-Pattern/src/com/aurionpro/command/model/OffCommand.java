package com.aurionpro.command.model;

public class OffCommand implements ICommand 
{

	Television tv;
	
	public OffCommand(Television tv) 
	{
		this.tv = tv;
	}

	@Override
	public void execute() 
	{
		tv.off();

	}

}
