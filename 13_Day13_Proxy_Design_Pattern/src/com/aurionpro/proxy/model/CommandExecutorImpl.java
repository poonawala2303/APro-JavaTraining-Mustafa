package com.aurionpro.proxy.model;

public class CommandExecutorImpl implements ICommandExecutor {

	@Override
	public void runCommand(String cmd) throws Exception{
		
		System.out.println("" + cmd + " executed.");
		
	}

}
