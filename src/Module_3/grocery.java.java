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
		System.out.println(coupon);
	}
}