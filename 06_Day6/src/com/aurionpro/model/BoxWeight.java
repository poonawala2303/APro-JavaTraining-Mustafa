package com.aurionpro.model;

public class BoxWeight extends Box {
	private double boxWeight;

	public BoxWeight(double width, double height, double depth, double boxWeight) {
		super(width, height, depth);
		this.boxWeight = boxWeight;
	}

	@Override
	public String toString() {
		return "BoxWeight [boxWeight=" + boxWeight + "]";
	}
	
	

}
