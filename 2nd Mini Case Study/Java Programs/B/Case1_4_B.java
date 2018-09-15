//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program displays a pattern according to the given number.*/

import java.util.*;

public class Case1_4_B{
	//initialization of scanner
	static Scanner Scanner = new Scanner (System.in);
	//initialization of integers
	public int Counter1,Counter2,Number;
	//assigning a valu to a variable
	public int Counter3=1;
	//method to get input
	public void GetNumber(){
	   Number=Scanner.nextInt();
	}
	//method to display the pattern
	void DisplayPattern(){
		Counter3=Number-1;
	for (Counter1=1;Counter1<=Number;Counter1++){
   	    for (Counter2=0;Counter2<=Counter3;Counter2++)
     	   System.out.print(" ");
 		   Counter3--;
  		for (Counter2=0;Counter2<=Counter1-1;Counter2++)
     		 System.out.print("* ");
   			 System.out.print("\n");
	}
	Counter3=1;
 	for(Counter1=1;Counter1<=Number-1;Counter1++){
 		for (Counter2=0;Counter2<=Counter3;Counter2++)
      	    System.out.print(" ");
 			Counter3++;
    	for(Counter2=0;Counter2<=(Number-Counter1)-1;Counter2++)
     			 System.out.print("* ");
	   			 System.out.print("\n");
 	 }
	}
    public static void main (String [] args){
		char Again;
		Case1_4_B Pattern = new Case1_4_B();
		do{
		System.out.print("Input n: ");
		Pattern.GetNumber();
		if(Pattern.Number<=0)
			System.out.println("Error, you must input a number higher than 0");
		else
			Pattern.DisplayPattern();
		do{
			System.out.print("Try Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}	
}


	