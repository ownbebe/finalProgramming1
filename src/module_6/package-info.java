package module_6;
import java.util.Scanner;

class module_6{
	
	private static void input() {
		Scanner scan = new Scanner(System.in);
		String month1;
		String month2;
		String month3;
		String answer1 = "january";
		String answer2 = "february";
		String answer3 = "march";
		Boolean correct1 = true; 
		Boolean correct2;
		Boolean correct3;
		try {
			System.out.println("What is the first month of the year: ");
			month1 = scan.nextLine();
			correct1 = month1.equalsIgnoreCase(answer1);
			
			if (correct1 == false) {
				throw new Exception("Failure");
			}
			
			System.out.println("What is the second month of the year: ");
			month2 = scan.nextLine();
			correct2 = month2.equalsIgnoreCase(answer2);
			
			if (correct2 != true) {
				throw new Exception("Failure");
			}
			
			System.out.println("What is the third month of the year: ");
			month3 = scan.nextLine();
			correct3 = month3.equalsIgnoreCase(answer3);
			
			if (correct3 != true) {
				throw new Exception("Failure");
			}
			System.out.println("Success!");
			System.out.println("Good answers!");
		}
			
			catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Sorry wrong answers.");
			}
		
		
			
	}
	
	public static void main(String[] args) {
		String quitCmd = "a";
		Scanner scan = new Scanner(System.in);
		
		while (quitCmd != "q") {
			System.out.println("What are the first three months of the year?");
			input();
			System.out.println("Would you like to continue?");
			System.out.println("Enter 'q' to quit and anything else to continue: ");
			quitCmd = scan.nextLine();
		}
	}
}
			
			
	

		
	
		
	
	