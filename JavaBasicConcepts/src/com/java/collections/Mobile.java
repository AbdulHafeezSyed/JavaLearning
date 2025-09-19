package com.java.collections;

public class Mobile implements Comparable<Mobile>{
	private int rank;
	private String brand;
	private int ram;
	private double price;
	public Mobile(int rank, String brand, int ram, double price) {
		super();
		this.rank = rank;
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	public int getRank() {
		return rank;
	}
	public String getBrand() {
		return brand;
	}
	public int getRam() {
		return ram;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Mobile [rank=" + rank + ", brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		
		return Double.compare(this.price, o.price);
	}
 
}
