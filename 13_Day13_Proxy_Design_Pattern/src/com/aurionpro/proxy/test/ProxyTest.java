package com.aurionpro.proxy.test;

import com.aurionpro.proxy.model.CommandExecutorProxy;
import com.aurionpro.proxy.model.ICommandExecutor;

public class ProxyTest 
{
	public static void main(String[] args) 
	{
		ICommandExecutor execute = new CommandExecutorProxy("Mustafa", "nU.2$45opi");
		
		try
		{
			execute.runCommand("ls -ltr");
			execute.runCommand("rm -rf abc.pdf");
		}
		
		catch (Exception e)
		{
			System.out.println("Exception Message: "+e.getMessage());
		}
	}
}
