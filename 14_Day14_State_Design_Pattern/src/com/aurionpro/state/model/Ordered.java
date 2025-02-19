package com.aurionpro.state.model;

public class Ordered implements IPacketState 
{
	Packet packet;


	@Override
	public void next(Packet packet) 
	{
		System.out.println("Packet ordered!! Now setting to Shipped state");
		packet.setPacketState(new Shipped());
	}

	@Override
	public void current(Packet packet) 
	{	
		System.out.println("In Ordered State");
	}

	@Override
	public void previous(Packet packet) 
	{	
		System.out.println("Order is at source!!");
	}

}
