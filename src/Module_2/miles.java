package Module_2;
import java.util.Scanner;

class miles{
	public static void main(String[] args) {
		String year;
		String make;
		String model;
		double odometer1;
		double odometer2;
		double gallonsUsed;
		double mpg;
		
		
		Scanner myObj = new Scanner(System.in);
		System.out.print("Input the year your car was made: ");
		year = myObj.nextLine();
		
		System.out.println("Input the make of your car: ");
		make = myObj.nextLine();
		
		System.out.println("Input the model of your car: ");
		model = myObj.nextLine();
		
		System.out.println("How much mileage is on your car before driving: ");
		odometer1 = myObj.nextDouble();
		
		System.out.println("How much mileage is on your car after driving: ");
		odometer2 = myObj.nextDouble();
		
		System.out.println("How many gallons of gas have you used: ");
		gallonsUsed = myObj.nextDouble();
		
		mpg = (odometer2 - odometer1) / gallonsUsed;
		System.out.print("Your " + year + " " + make + " " + model + " has ");
		System.out.println("MPG: " + mpg);
	}
}