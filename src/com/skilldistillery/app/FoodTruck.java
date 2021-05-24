package com.skilldistillery.app;

public class FoodTruck {
	
	private int truckID;
	private String truckName;
	private String foodType;
	private double rating;
	
	
	public FoodTruck(int truckID, String truckName, String foodType, double rating) {
		super();
		this.truckID = truckID;
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
	}



	public int getTruckID() {
		return truckID;
	}


	public void setTruckID(int truckID) {
		this.truckID = truckID;
	}


	public String getTruckName() {
		return truckName;
	}


	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}


	public String getFoodType() {
		return foodType;
	}


	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}
	

}
