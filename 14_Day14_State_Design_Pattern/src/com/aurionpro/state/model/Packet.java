package com.aurionpro.state.model;

public class Packet 
{
	IPacketState packetState;
	
	public Packet() 
	{
		this.packetState = new Ordered();
	}

	public IPacketState getPacketState() {
		return packetState;
	}

	public void setPacketState(IPacketState packetState) {
		this.packetState = packetState;
	}
	
	public void goToNextState()
	{
		packetState.next(this);
	}
	
	public void goToPreviousState()
	{
		packetState.previous(this);
	}
	
	public void printCurrentStatus()
	{
		packetState.current(this);
	}
	
}
