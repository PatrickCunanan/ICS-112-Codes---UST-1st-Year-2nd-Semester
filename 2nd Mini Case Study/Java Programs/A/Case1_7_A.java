//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program display a multiplication table within the range of the start and end number*/

import java.util.*;
public class Case1_7_A{
static Scanner Scanner = new Scanner (System.in);
public static void main (String[]args){
	char Again;
	int StartNumber,EndNumber,Counter;
	do{
	System.out.print("Input starting number: ");
	StartNumber=Scanner.nextInt();
	System.out.print("Input ending number: ");
	EndNumber=Scanner.nextInt();
	if(StartNumber>EndNumber)
	   System.out.println("Error, your starting number must be lower than your ending number.");
	else{
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
		do{
			System.out.print("\nTry Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}