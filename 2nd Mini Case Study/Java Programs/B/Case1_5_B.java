//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program is used to input a number 'n' and display the numbers 1 to 'n'.*/

import java.util.*;

public class Case1_5_B{
	//initialization of scanner
	static Scanner Scanner = new Scanner (System.in);
	//initialization of integers
	public int Number, Counter;
	//method to get input
	public void GetNumber(){
	   Number=Scanner.nextInt();
	}
	//method to display the numbers
	public void IntegerDisplay(){
       for(Counter=0;Counter<Number;Counter++)
	      System.out.print((Counter+1)+" ");
	  System.out.print("\n");
	}
    public static void main (String [] args){
		char Again;
		Case1_5_B Integer = new Case1_5_B();
		do{
		System.out.print("Input number: ");
		Integer.GetNumber();
		if (Integer.Number<=0)
			System.out.println("Error, you must input a value ");
		else
			Integer.IntegerDisplay();
		do{
			System.out.print("Try Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}
