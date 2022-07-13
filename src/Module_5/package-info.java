package Module_5;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
 


class Module_5{
	/**
	 * displays menu of options
	 */
	private static void menu() {
		System.out.println("Options");
		System.out.println("---------------");
		System.out.println("Sunday");
		System.out.println("Monday");
		System.out.println("Tuesday");
		System.out.println("Wednesday");
		System.out.println("Thursday");
		System.out.println("Friday");
		System.out.println("Saturday");
		System.out.println("Week");
		System.out.println("Exit");
		
	}
	
	public static void main(String[] args) {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);
		ArrayList<String> day = new ArrayList();
		ArrayList<Double> temp = new ArrayList();
		String input;
		boolean flag = false;
		
		day.add("Sunday");
		day.add("Monday");
		day.add("Tuesday");
		day.add("Wednesday");
		day.add("Thursday");
		day.add("Friday");
		day.add("Saturday");
		
		for(int i = 0; i < 7; i++) {
			double new_temp = r.nextDouble(100 - 70) + 70;
			new_temp = Math.round(new_temp * 100.0) / 100.0;
			temp.add(new_temp);
		}
		
		while(!flag) {
			System.out.println("Please enter a day of the week: ");
			menu();
			input = scan.nextLine();
			switch (input) {
			case "Sunday": {
				System.out.println("The temp on " + input + " was " + temp.get(0).toString() + ".");
				break;
				
			}
			case "Monday": {
				System.out.println("The temp on " + input + " was " + temp.get(1).toString() + ".");
				break;
				
			}
			case "Tuesday": {
				System.out.println("The temp on " + input + " was " + temp.get(2).toString() + ".");
				break;
				
			}
			case "Wednesday": {
				System.out.println("The temp on " + input + " was " + temp.get(3).toString() + ".");
				break;
				
			}
			case "Thursday": {
				System.out.println("The temp on " + input + " was " + temp.get(4).toString() + ".");
				break;
				
			}
			case "Friday": {
				System.out.println("The temp on " + input + " was " + temp.get(5).toString() + ".");
				break;
				
			}
			case "Saturday": {
				System.out.println("The temp on " + input + " was " + temp.get(6).toString() + ".");
				break;
				
			}
			case "Week": {
				Double sum = 0.0;
				for(int i = 0; i < 7; i++) {
					
					System.out.println("The temp on " + day.get(i) + " was " + temp.get(i).toString() + ".");
					sum += temp.get(i);
				}
				Double average = sum / 7;
				average = Math.round(average * 100.0) / 100.0;
				System.out.println("The average temperature of the week was " + average.toString() + ".");
				break;
			}
			case "Exit": {
				System.out.println("Exiting program.");
				flag = true;
				break;
			}
			default:
				System.out.println("Invalid input try again.");
				break;	
			}
		}	
	}
}