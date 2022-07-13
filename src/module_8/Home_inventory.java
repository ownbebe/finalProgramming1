package module_8;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Home_inventory {
	private static ArrayList<Home> inventory;
	private static String filePath = "C:/Temp/Home.txt";
	
	public Home_inventory() {
		inventory = new ArrayList<Home>();
	}

	public boolean add_home(Home new_home) {
		try {
			inventory.add(new_home);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean remove_home(int index) {
		try {
			inventory.remove(index);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	private static void menu() {
		System.out.println("Options");
		System.out.println("---------------");
		System.out.println("1. List inventory");
		System.out.println("2. Add home");
		System.out.println("3. Remove home");
		System.out.println("4. Update home");
		System.out.println("5. Exit");
		System.out.println("Enter option: ");
	}
	
	public static void list_inventory() {
		for(int i = 0; i < inventory.size(); i++) {
			System.out.println("Home " + String.valueOf(i + 1));
			System.out.println("---------------");
			System.out.println("Square feet: " + String.valueOf(inventory.get(i).getSquare_feet()));
			System.out.println("Address: " + inventory.get(i).getAddress());
			System.out.println("City: " + inventory.get(i).getCity());
			System.out.println("State: " + inventory.get(i).getState());
			System.out.println("Zip code: " + String.valueOf(inventory.get(i).getZip_code()));
			System.out.println("Model name: " + inventory.get(i).getModel_name());
			System.out.println("Sale status: " + inventory.get(i).getSale_status());
			System.out.println(" ");
		}
		
	}
	
	public static boolean save_inventory(String path)
	{
		try {
			FileWriter writer = new FileWriter(filePath);
			for(int i = 0; i < inventory.size(); i++) {
				writer.write("Home " + String.valueOf(i + 1) + "\n");
				writer.write("---------------\n");
				writer.write("Square feet: " + String.valueOf(inventory.get(i).getSquare_feet()) + "\n");
				writer.write("Address: " + inventory.get(i).getAddress() + "\n");
				writer.write("City: " + inventory.get(i).getCity() + "\n");
				writer.write("State: " + inventory.get(i).getState() + "\n");
				writer.write("Zip code: " + String.valueOf(inventory.get(i).getZip_code()) + "\n");
				writer.write("Model name: " + inventory.get(i).getModel_name() + "\n");
				writer.write("Sale status: " + inventory.get(i).getSale_status() + "\n");
				writer.write("\n");
			}
			writer.close();
			return true;
			
		} catch (IOException e) {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		int choice;
		
		inventory = new ArrayList<Home>();
		
		while(flag) {
			menu();
			choice = Integer.valueOf(scan.nextLine());
			
			switch (choice) {
			case 1: {	
				list_inventory();
				
				break;
			}
			
			case 2: {
				System.out.println("Enter Sq Ft: ");
				String sq_ft = scan.nextLine();
				System.out.println("Enter Address: ");
				String add = scan.nextLine();
				System.out.println("Enter City: ");
				String city = scan.nextLine();
				System.out.println("Enter State: ");
				String state = scan.nextLine();
				System.out.println("Enter Zip Code: ");
				String zip = scan.nextLine();
				System.out.println("Enter Model Name: ");
				String model = scan.nextLine();
				System.out.println("Enter Sale Status: ");
				String status = scan.nextLine();
				
				Home new_home = new Home(Integer.valueOf(sq_ft), add, city, state, Integer.valueOf(zip), model, status);
				
				boolean result = inventory.add(new_home);
				
				if (result) {
					System.out.println("Successfully added home to inventory");
				}
				else {
					System.out.println("ERROR: home not added to inventory");
				}
				
				break;
			}
			
			case 3: {
				System.out.println("Enter number of home from list to be deleted: ");
				int index = Integer.valueOf(scan.nextLine());
				boolean result = remove_home(index - 1);
				
				if (result) {
					System.out.println("Successfully removed home from inventory");
				}
				else {
					System.out.println("ERROR: Did not find address in inventory");
				}
				
				break;
			}
			
			case 4: {
				System.out.println("Enter number of home from list to be modified: ");
				int index = Integer.valueOf(scan.nextLine());
				System.out.println("Enter new status of house " + String.valueOf(index) + ": ");
				String status = scan.nextLine();
				boolean result = inventory.get(index - 1).setSale_status(status);
				
				if (result) {
					System.out.println("Successfully updated status of home in inventory");
				}
				else {
					System.out.println("ERROR: Did not successfully update status of home in inventory");
				}
				
				break;
			}
			
			case 5: {
				System.out.println("Exiting");
				flag = false;
				break;
			}
			
			default:
				System.out.println("Invalid option, try again.");
				break;
			}
			System.out.println(" ");
		}
		
		System.out.println("Do you want to save the inventory to a file (y/n)?");
		String save = scan.nextLine();
		boolean result;
		if (save.equalsIgnoreCase("y")) {
			result = save_inventory(filePath);
			
			if (result) {
				System.out.println("Successfully saved to " + filePath);
			}
			
			else {
				System.out.println("ERROR: did not save to " + filePath);
			}
		}
	}
}
