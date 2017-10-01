/**
 * CS 2003 - Lab 1. Code to compute the average of doubles from an input
 * file.  NOTE: add data members and methods at your convenience. Use
 * the most accurate data types. You can reuse bits of code from
 * the class Lab1a.
 *
 * @author
 */

import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * @author angelam
 *
 */
public class Names {	
	String []nameArray = new String[100];
//after file scanned, read in a list of names and number of students. Create dimensions for a new 2D array. 
	public void populateArray(String[]names, int count) {
		
		
	}
//read file trying to scan in 
	public void readFile() {
		java.io.File file = new java.io.File("names.txt");
		try {
				Scanner input = new Scanner(file);
				while(input.hasNext()) {
					String num = input.nextLine();
					System.out.println(num);
				}
		}
		catch (FileNotFoundException e) {
			System.err.format("File does not exist\n");
		}
	
	}
//get name from seating chart 
	public String getSeat(int row, int column, String [][] seatChart) {
		
	}
	
	public static void main(String[] args) {
		Names chart = new Names();
		Scanner scan = new Scanner(System.in);
		int row;
		int col;
		
		chart.readFile();
		chart.populateArray();
		System.out.println("Row?");
		row = scan.nextInt();
		System.out.println("Column?");
		col = scan.nextInt();
		chart.getSeat(row ,col);
		
		
	 //Scanner file = new Scanner(new FileReader("names.txt");
	}
