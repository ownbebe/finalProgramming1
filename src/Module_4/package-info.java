package Module_4;
import java.util.Scanner;

class Module_4{
	public static void main(String[] args) {
		float score;
		Scanner scan = new Scanner(System.in);
		float[] array;
		array = new float[10];
		float total = 0;
		float average;
		float max = 0;
		float min = Float.MAX_VALUE;
		
		//for loop to accepts 10 inputs that get stored in an array
		for (int i = 0; i < 10; i++) {
			System.out.println("What was the score: ");
			array[i] = scan.nextFloat();
		}
		
		//finds the total of the scores to find the average
		for(int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		
		average = total / array.length;
		
		//for loop to find max score
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		//for loop to find min score
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		
		
		
		
		System.out.println("The average score was " + average + ".");
		System.out.println("The maximum score was " + max + ".");
		System.out.println("The minimum score was " + min + ".");
		
		
	}
}