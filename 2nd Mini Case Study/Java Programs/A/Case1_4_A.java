//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program displays a pattern according to the given number*/

import java.util.*;
public class Case1_4_A{
static Scanner Scanner = new Scanner (System.in);
public static void main (String[]args){
	char Again;
	int Counter1,Counter2,Number;
	int Counter3=1;
	do{
	System.out.print("Enter value of n: ");
	Number=Scanner.nextInt();
	if(Number<0)
		System.out.println("Error, you entered a negative number.");
	else{
	System.out.println("n = " +Number +"\n");
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
		do{
			System.out.print("Try Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}