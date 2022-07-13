package Module_3;
import java.util.Scanner;

class grocery{
	public static void main(String[] args) {
		double coupon;
		double groceryBill1;
		double groceryBill2;
		double groceryBill3;
		double groceryBill4;
		double month;
		double average;
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("How much is your coupon as a decimal: ");
		coupon = myObj.nextDouble();
		
		if (coupon > 1 || coupon <= 0) {
			coupon = 0.10;
		}
		System.out.println("How much did you spend on groceries in week 1: ");
		groceryBill1 = myObj.nextDouble();
		
		System.out.println("How much did you spend on groceries in week 2: ");
		groceryBill2 = myObj.nextDouble();
		
		System.out.println("How much did you spend on groceries in week 3: ");
		groceryBill3 = myObj.nextDouble();
		
		System.out.println("How much did you spend on groceries in week 4: ");
		groceryBill4 = myObj.nextDouble();
		
		month = groceryBill1 + groceryBill2 + groceryBill3 + groceryBill4;
		average = (groceryBill1 + groceryBill2 + groceryBill3 + groceryBill4) / 4;
		
		System.out.println("You spend " + month + " dollars a month on groceries.");
		System.out.println("Your weekly average of dollars spent on groceries is " + average + ".");
		
		month = month - ( month *coupon);
		average = average - (average * coupon); 
		
		System.out.println("You spend " + month + " dollars a month on groceries with your coupon.");
		System.out.println("Your weekly average of dollars spent on groceries with your coupon is " + average + ".");
	}
}