//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program display a multiplication table within the range of the start and end number.*/

import java.util.*;

public class Case1_7_B{
	//initialization of scanner
	static Scanner Scanner = new Scanner (System.in);
	//initialization of integers
	int StartNumber,EndNumber,Counter;
	//method to get start number
	public void GetStartNumber(){
	   StartNumber=Scanner.nextInt();
	}
	//method to get end number
	public void GetEndNumber(){
	   EndNumber=Scanner.nextInt();
	}
	//method to display multiplication table
	public void DisplayTable(){
		System.out.print("   ");
	 for (Counter=0;Counter<10;Counter++)
	    System.out.format("%3d ",(Counter+1));
	 System.out.print("\n");
	 for (StartNumber=StartNumber;StartNumber<=EndNumber;StartNumber++){
	    System.out.format("%2d ",StartNumber);
	    for (Counter=0;Counter<10;Counter++)
	       System.out.format("%3d ",(StartNumber*(Counter+1)));
	System.out.println("");
	}
	}
	public static void main (String [] args){
		char Again;
		Case1_7_B MultiplicationTable = new Case1_7_B();
		do{
		System.out.print("Input starting number: ");
		MultiplicationTable.GetStartNumber();
		System.out.print("Input end number: ");
		MultiplicationTable.GetEndNumber();
		if (MultiplicationTable.StartNumber>MultiplicationTable.EndNumber)
			System.out.println("Error, your starting number must be lower than your ending number.");
		else
			MultiplicationTable.DisplayTable();
		do{
			System.out.print("Try Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}
