package com.java.map;

public class Cities {
	String state;
	String city;

	public Cities(String state, String city) {
		super();
		this.state = state;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Cities [state=" + state + ", city=" + city + "]";
	}

}
