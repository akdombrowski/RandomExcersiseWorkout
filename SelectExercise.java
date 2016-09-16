import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Author: Anthony Dombrowski
 * Date: Sep 5, 2016
 * File: SelectExercise.java
 * Purpose: 
 */

public class SelectExercise {
	private Exercise[] exercises;
	private int min;
	private int max;
	private int numOfExercises;
	private int currExerciseIndex;
	
	public SelectExercise(Exercise[] exercises) {
		this.exercises = exercises;
		numOfExercises = 0;
		min = 5;
		max = 10;
		currExerciseIndex = 0;
	}
	
	public SelectExercise(Scanner sc) throws Exception {
		numOfExercises = sc.nextInt();
		min = sc.nextInt();
		max = sc.nextInt();
		currExerciseIndex = 0;
		int lineCount = 1;
		int totalExercises = (max - min + 1) * numOfExercises;
		
		exercises = new Exercise[totalExercises];
		sc.nextLine();
		int currIndex = 0;
		while(lineCount <= numOfExercises) {
			if(!sc.hasNextLine()) {
				throw new Exception("not enough exercises");
			}
			lineCount++;
			String line = sc.nextLine();
			
			for(int i = max; i >= min; i--) {
				exercises[currIndex++] = new Exercise(line, i);
			}
		}
		shuffle();
	}
	
	public void shuffle() {
		Random rnd = new Random();
		
		int size = exercises.length;
		for(int i = 0; i < size; i++) {
			int randIndex = rnd.nextInt(size - i) + i;
			Exercise randIndexExerc = exercises[randIndex];
			exercises[randIndex] = exercises[i];
			exercises[i] = randIndexExerc;
		}
	}
	
	public String nextExercise() {		
		if(isWorkoutDone()) {
			System.out.println("workout is done");
		}
		
		// get random exercise
		Exercise nextEx = exercises[currExerciseIndex++];
		// get the exercise name
		String exName = nextEx.getName();
		int count = nextEx.getCount();
		
		// return the name and count
		return exName + ": " + count;
	}
	
	public boolean isWorkoutDone() {
		return currExerciseIndex == exercises.length;
	}
}
