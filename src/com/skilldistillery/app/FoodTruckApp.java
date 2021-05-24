package com.skilldistillery.app;

import java.util.Scanner;

public class FoodTruckApp {
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		userInput();
		
	}
		static void userInput() {
	
		int numberOfTrucks;
		numberOfTrucks = 1;
		
		while (numberOfTrucks <= 5) {
		System.out.print("Input the name of a food truck: ");
		String truckName = kb.next();
		if (truckName.equalsIgnoreCase("quit")) {
			System.out.println("Quitting Food Truck App...Goodbye");
			break;
		}
		int truckID = numberOfTrucks;
		System.out.println();
		System.out.print("Input the type of food served by the aforementioned food truck: ");
		String foodType = kb.next();
		System.out.println();
		System.out.print("Rate the food truck on a scale of 1 to 10: ");
		double rating = kb.nextDouble();
		System.out.println("");
		
			if (numberOfTrucks == 1) {
				FoodTruck truck1 = new FoodTruck(truckID, truckName, foodType, rating);
			}
			else if (numberOfTrucks == 2) {
				FoodTruck truck2 = new FoodTruck(truckID, truckName, foodType, rating);
			}
			else if (numberOfTrucks == 3) {
				FoodTruck truck3 = new FoodTruck(truckID, truckName, foodType, rating);
			}
			else if (numberOfTrucks == 4) {
				FoodTruck truck4 = new FoodTruck(truckID, truckName, foodType, rating);
			}
			else if (numberOfTrucks == 5) {
				FoodTruck truck5 = new FoodTruck(truckID, truckName, foodType, rating);
			}
		numberOfTrucks ++;
		}
		
		printMenu();
		menuSelection();
		
	
		}
		
		public static String getAverageRating() {
			double rating1 = truck1.getRating();
			double rating2 = truck2.getRating();
			double rating3 = truck3.getRating();
			double rating4 = truck4.getRating();
			double rating5 = truck5.getRating();
			
			double averageRating = (rating1 + rating2 + rating3 + rating4 + rating5) / 5;
			System.out.println(averageRating);
		}
		
		public static String getHighestRating() {
			String highestRating = truck1.getRating();
			if(highestRating < truck2.getRating()) {
				highestRating = truck2.gdtRating();
			}
			if(highestRating < truck3.getRating()) {
				highestRating = truck3.gdtRating();
			}
			if(highestRating < truck4.getRating()) {
				highestRating = truck4.gdtRating();
			}
			if(highestRating < truck5.getRating()) {
				highestRating = truck5.gdtRating();
			}
			return highestRating;
		}
		
		public static void printMenu() {
			System.out.println();
			System.out.println("Input the number of your desired menu option");
			System.out.println();
			System.out.println("1. List Food Trucks");
			System.out.println("2. Average Rating of All Food Trucks");
			System.out.println("3. Top Rated Food Truck");
			System.out.println("4. Quit the App");
		}
		
		public static String menuSelection() {
			int menuChoice = kb.nextInt();
			if (menuChoice != 4) {
			switch(menuChoice) {
			case 1:
				return 
						System.out.println(truck1.getTruckName());
						System.out.println(truck2.getTruckName());
						System.out.println(truck3.getTruckName());
						System.out.println(truck4.getTruckName());
						System.out.println(truck5.getTruckName());
						printMenu();
			case 2:
				return	getAverageRating();
						printMenu();
						
				
			case 3: 	
				return getHighestRating();
						printMenu();
			
			case 4:
				break;
						
						
			}
			
		}
		}
		
		
		
	}

