package com;

import java.util.Scanner;

public class Student_grade_calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Student Grade Calculator");
		System.out.println("Enter number of Subjects");

		int ns=sc.nextInt();
		int sum=0;
		int[] marks=new int[ns];
		System.out.println("Enter marks obtained in "+ ns +" "+"subjects:");
		for (int i = 0; i <ns; i++) {
		 marks[i]=sc.nextInt();
		 sum+=marks[i];
		}
		
		double averagepercentages=(double)sum/ns;
		
		char Grade;
		if(averagepercentages>=90) {
			Grade='0';
		}
		else if(averagepercentages>=80) {
			Grade='A';
		}
		else if(averagepercentages>=70) {
			Grade='B';
		}
		else if(averagepercentages>=60) {
			Grade='C';
		}
		else if(averagepercentages>=50) {
			Grade='D';
		}
		else if(averagepercentages>=40) {
			Grade='E';
		}
		else {
			Grade='F';
		}
		
		System.out.println("Total marks scored is"+" "+sum);
		System.out.println("Average percentage gained is"+" "+averagepercentages+"%");
		System.out.println("Grade:"+" "+Grade);
	}

}
