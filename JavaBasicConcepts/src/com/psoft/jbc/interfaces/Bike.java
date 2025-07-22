package com.psoft.jbc.interfaces;

public class Bike implements Rentable {
	String Brand;
	int perdaycost=200;
	int cost;

	public Bike(String brand) {
     this.Brand = brand;
	}

	public double calculateRentalCost(int days) {
		 cost=days*perdaycost;
		System.out.println("Rentalcost:"+cost);
		return 0;
	}

	public void displayDetails() {
		System.out.println("Brand="+Brand+"\nTotalrentalcost="+cost);
	}

}
