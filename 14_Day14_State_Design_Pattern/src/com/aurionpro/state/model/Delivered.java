package com.aurionpro.state.model;

public class Delivered implements IPacketState {

	Packet packet;
	
	@Override
	public void next(Packet packet) 
	{
		System.out.println("Package already delivered :) ");
	}

	@Override
	public void current(Packet packet) 
	{
		System.out.println("In Delivered state");
	}

	@Override
	public void previous(Packet packet) 
	{
		System.out.println("Going back to Shipped state");
		packet.setPacketState(new Shipped());
	}

}
