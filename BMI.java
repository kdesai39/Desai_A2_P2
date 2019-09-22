package Desai_project2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner (System.in);
		 
		int formula, weight, height, bmi;
		
		System.out.print("1: Imperial units or 2: Metric units");
		formula = scnr.nextInt();
		
		if(formula == 1) {
			System.out.print("Enter your Weight in Pounds: ");
			weight = scnr.nextInt();
			System.out.print("Enter your Height in Inches: ");
			height = scnr.nextInt();
			bmi = (703*weight) / (height*height);
			System.out.println("Your BMI is " + bmi);
			System.out.println("");
			
		}
		
		if(formula == 2) {
			System.out.print("Enter your Weight in Kilograms: ");
			weight = scnr.nextInt();
			System.out.print("Enter your Height in Meter: ");
			height = scnr.nextInt();
			bmi = (weight) / (height*height);
			System.out.println("Your BMI is " + bmi);
			System.out.println("");
			
		}
		
		 System.out.println ("BMI VALUES");
	     System.out.println ("Underweight: less than 18.5");
	     System.out.println ("Normal:      between 18.5 and 24.9");
	     System.out.println ("Overweight:  between 25 and 29.9");
	     System.out.println ("Obese:       30 or greater");
		
	}

}
