//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/* This Program converts an input between 0 - 255 to its 8-bit binary equivalent.*/

import java.util.*;

public class Case2_10_B{
	//initialization of scanner
	static Scanner Scanner = new Scanner (System.in);
	//initialization of integers
	int Number,Quotient,Counter1=1,Counter2;
	//initialization of an array
	int Binary[]= new int[100];
	//method to get input
	public void GetNumber(){
	   Number=Scanner.nextInt();
	}
	//method to display the binary number
	public void DisplayBinary(){
		Quotient=Number;
	while(Quotient!=0){
		Binary[Counter1++]=Quotient%2;
		Quotient=Quotient/2;
	}
	System.out.print("Equivalent binary number: ");
	for(Counter2=Counter1-1;Counter2>0;Counter2--)
	   System.out.print(Binary[Counter2]);
    Counter1 = 1;
	}
	public static void main(String[]args){
		char Again;
		Case2_10_B Binary = new Case2_10_B();
		do{
		System.out.print("Enter decimal number: ");
	    Binary.GetNumber();
		if(Binary.Number<0||Binary.Number>255)
	       System.out.print("Error, your input should be greater than 0 or less than 255.");
	    else
			Binary.DisplayBinary();
		do{
			System.out.print("\nTry Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}
