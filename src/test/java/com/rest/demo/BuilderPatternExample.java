package com.rest.demo;

public class BuilderPatternExample {
	public static void main(String[] args) {
		Phone nokiaPhone = new Phone();
		nokiaPhone.setColor("Black").setMake("Nokia").setNetworkType("GSM");
		System.out.println();
	}
}
