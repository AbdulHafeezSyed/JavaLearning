package com.psoft.jbc.interfaces;

public class Bike implements Rentable {
	String Brand;
	int cost=200;
	int Totalcost;

	public Bike(String brand) {
     this.Brand = brand;
	}

	public double calculateRentalCost(int days) {
		Totalcost=days*cost;
		System.out.println("Rentalcost:"+Totalcost);
		return 0;
	}

	public void displayDetails() {
		System.out.println("Brand="+Brand+"\nTotalrentalcost="+Totalcost);
	}

}
