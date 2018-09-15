//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This Program displays a n by n square according to the input of the user.*/

import java.util.*;

public class Case2_9_B{
	//initialization of scanner
	static Scanner Scanner = new Scanner (System.in);
	//initialization of integers
	public int Number,Counter1,Counter2;
	//method to get input
	public void GetNumber(){
	   Number=Scanner.nextInt();
	}
	//method to display the square pattern
	public void DisplaySquare(){
	System.out.print("\n");
	 for(Counter1=0;Counter1<Number;Counter1++){
	    for(Counter2=0;Counter2<Number;Counter2++){
	       System.out.print("*");
	  }
	    System.out.print("\n");
	}
	}
    public static void main (String[] args){
	   char Again;
	   Case2_9_B Square = new Case2_9_B();
	   do{
	   System.out.print("Input n: ");
	   Square.GetNumber();
	   if(Square.Number==0||Square.Number<0)
	      System.out.print("Error, your input should not be a negative number.");
	   else
		  Square.DisplaySquare(); 
	  do{
			System.out.print("Try Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}
