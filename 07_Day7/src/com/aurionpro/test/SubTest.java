package com.aurionpro.test;

import com.aurionpro.model.Base;
import com.aurionpro.model.Sub;

public class SubTest {
	
	public static void main(String[] args) 
	{
		Base base = new Base();
		base.show();
		
		Sub sub = new Sub();
		sub.show();
		
		base = sub;
//		
//		base.show();
		
//		Base base1 = new Sub();
//		base1.show();
		
		((Sub)base).display();

	}
}
