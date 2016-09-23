/**
 * Author: Anthony Dombrowski
 * Date: Sep 5, 2016
 * File: Exercise.java
 * Purpose: 
 */

import java.util.Scanner;

public class Exercise {
	private String name;
	private int count;
	
	public Exercise(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	public Exercise(Scanner sc) {
		count = sc.nextInt();
		name = sc.nextLine();
	}
	
	public String toString() {
		return name + ": " + count;
	}
	
	public int getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}
	
	public void decrementCount() {
		count--;
	}
	
	public void incrementCount() {
		count++;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public boolean isCountLessThanMin(int min) {
		return count < min;
	}
}
