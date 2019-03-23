package com.openclassrooms;
import java.util.Scanner;
public class HelloBugs {

	public static void main(String[] args) {
		System.out.println("please enter the number of times you want to print Hello buggy code!,"+
		   "\n enter your response:");
	        Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i=0;i<=num;i++) {
		System.out.println("Hello buggy code!");
		}
				
	}

}
