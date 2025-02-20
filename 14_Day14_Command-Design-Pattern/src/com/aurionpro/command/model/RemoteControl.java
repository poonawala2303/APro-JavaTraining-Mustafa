package com.aurionpro.command.model;

// this is the invoker object

public class RemoteControl 
{
	ICommand command;

	public RemoteControl(ICommand command) 
	{
		this.command = command;
	}
	
	public void pressButton()
	{
		command.execute();
	}
	
}
