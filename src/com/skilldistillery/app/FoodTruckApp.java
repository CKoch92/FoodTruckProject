package com.skilldistillery.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
	
		int numberOfTrucks;
		numberOfTrucks = 1;
		
		while (numberOfTrucks <= 5) {
		System.out.print("Input the name of a food truck: ");
		String truckName = kb.next();
		if (truckName.equalsIgnoreCase("quit")) {
			break;
		}
		int truckID = numberOfTrucks;
		System.out.println();
		System.out.print("Input the type of food served by the aforementioned food truck: ");
		String foodType = kb.next();
		System.out.println();
		System.out.print("Rate the food truck on a scale of 1 to 10: ");
		double rating = kb.nextDouble();
		
			if (numberOfTrucks == 1) {
				FoodTruck truck1 = new FoodTruck(truckID, truckName, foodType, rating);
			}
			else if (numberOfTrucks == 2) {
				FoodTruck truck2 = new FoodTruck(truckID, truckName, foodType, rating);
			}
			else if (numberOfTrucks == 3) {
				FoodTruck truck2 = new FoodTruck(truckID, truckName, foodType, rating);
			}
			else if (numberOfTrucks == 4) {
				FoodTruck truck2 = new FoodTruck(truckID, truckName, foodType, rating);
			}
			else if (numberOfTrucks == 5) {
				FoodTruck truck2 = new FoodTruck(truckID, truckName, foodType, rating);
			}
		numberOfTrucks ++;
		}
		
		FoodTruckApp app = new FoodTruckApp();
		
	}

}
