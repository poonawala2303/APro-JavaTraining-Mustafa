package com.aurionpro.command.test;

import com.aurionpro.command.model.ICommand;
import com.aurionpro.command.model.OffCommand;
import com.aurionpro.command.model.RemoteControl;
import com.aurionpro.command.model.Television;

public class TelevisionTest 
{
	public static void main(String[] args) 
	{
//		Television tv = new Television(); // making the reciever object
//		ICommand onCommand = new OnCommand(tv); // attaching tv obj to ICommand
//		
//		RemoteControl remote = new RemoteControl(onCommand); // creating invoker obj and attaching the onCommand
//		
//		remote.pressButton();
		
		Television tv = new Television(); // making the reciever object
		ICommand offCommand = new OffCommand(tv); // attaching tv obj to ICommand
		
		RemoteControl remote = new RemoteControl(offCommand); // creating invoker obj and attaching the offCommand
		
		remote.pressButton();

	}
}
