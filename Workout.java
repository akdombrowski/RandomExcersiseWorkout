import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Author: Anthony Dombrowski
 * Date: Sep 5, 2016
 * File: Workout.java
 * Purpose: 
 */

public class Workout {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(new File("test.txt")); 
				Scanner userInput = new Scanner(System.in)) {
			String options = "x = exit or press enter = next: ";
			
			SelectExercise se = new SelectExercise(sc);

			System.out.print(options);
			String input = userInput.nextLine().trim();
			
			
			while(!input.equalsIgnoreCase("x")) {
				
				if(!se.isWorkoutDone()) {
					System.out.println();
					
					System.out.println(se.nextExercise());
					
					System.out.println(options);
					input = userInput.nextLine().trim();
					
				} else {
					break;
				}
			}
			
			
			if(se.isWorkoutDone()) {
				System.out.println("Workout completed!");	
			} else {
				System.out.println("Workout exited!");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
