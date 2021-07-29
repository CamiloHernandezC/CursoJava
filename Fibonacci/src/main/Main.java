package main;

import java.util.*; 
import java.io.*;

public class Main {

	public static String FibonacciChecker(int num) {
		
		int i1 = 1;
		int i0 = 0;
		int i  = 0;
		while(i<num){
			System.out.println(i);
			i = i1 + i0;
			i0 = i1;
			i1 = i;
			
		}
		if(num == i){
			return "yes";
		}
		return "no";
  }

  public static void main (String[] args) {  
	  // keep this function call here     
	  Scanner s = new Scanner(System.in);
	  try {
		  int num = Integer.valueOf(s.nextLine());
		  System.out.print(FibonacciChecker(num));
	  }catch (NumberFormatException e) {
		System.out.print("Invalid number, please try again");
	}
	   
  }

}