//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This Program displays a n by n square according to the input of the user.*/

import java.util.*;
public class Case2_9_A{
static Scanner Scanner = new Scanner (System.in);
public static void main (String[]args){
	char Again;
	int Number,Counter1,Counter2;
	do{
	System.out.print("Input n: ");
	Number=Scanner.nextInt();
	if(Number==0||Number<0)
	   System.out.print("Error, your input should not be a negative number.");
	else
	 System.out.print("\n");
	 for(Counter1=0;Counter1<Number;Counter1++){
	    for(Counter2=0;Counter2<Number;Counter2++){
	       System.out.print("*");
	  }
	    System.out.print("\n");
	}
		do{
			System.out.print("\nTry Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}