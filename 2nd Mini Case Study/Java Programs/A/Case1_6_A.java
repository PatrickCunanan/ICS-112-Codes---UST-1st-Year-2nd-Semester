//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program is used to compute the odd numbers between 1 and 15*/

import java.util.*;
public class Case1_6_A{
static Scanner Scanner = new Scanner (System.in);
public static void main (String[]args){
	char Again;
	int Number,Counter;
	int ProductCounter=1;
	do{
	System.out.print("Enter a number between 1 and 15: ");
	Number=Scanner.nextInt();
	if(Number<=0||Number>15)
	   System.out.println("Error, you mus input a number higher than 0 or lower than 15.");
	else{
	 for(Counter=1;Counter<=Number;Counter+=2){
	    System.out.print(Counter+" ");
	    ProductCounter*=Counter;
	}
	System.out.print("\nThe product of the odd integers between 1 and "+Number+" is "+ProductCounter);
	ProductCounter=1;
	}
		do{
			System.out.print("\nTry Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}