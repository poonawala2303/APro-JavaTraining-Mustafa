package com.aurionpro.state.test;

import com.aurionpro.state.model.Packet;

public class PacketTest 
{
	public static void main(String[] args) 
	{
		Packet packet = new Packet();
		
		packet.printCurrentStatus(); // ordered
		packet.goToNextState(); // shipped
		packet.goToNextState(); // delivered
		packet.goToNextState(); // already delivered
		
		packet.goToPreviousState(); // shipped state 
		packet.goToPreviousState(); // ordered state
		packet.goToPreviousState(); // order is at source
		
	}
}
