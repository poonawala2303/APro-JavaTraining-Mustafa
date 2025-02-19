package com.aurionpro.state.model;

public class Shipped implements IPacketState {

	Packet packet;
	
	@Override
	public void next(Packet packet) 
	{
		System.out.println("Order Shipped, Now setting Packet State to be delivered");
		packet.setPacketState(new Delivered());
	}

	@Override
	public void current(Packet packet) 
	{
		System.out.println("In Shipped state");
	}

	@Override
	public void previous(Packet packet) 
	{
		System.out.println("Going back to Ordered State");
		packet.setPacketState(new Ordered());
	}

}
