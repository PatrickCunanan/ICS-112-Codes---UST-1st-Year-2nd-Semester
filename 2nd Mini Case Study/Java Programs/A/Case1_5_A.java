//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program is used to input a number 'n' and display the numbers 1 to 'n'.*/

import java.util.*;
public class Case1_5_A{
static Scanner Scanner = new Scanner (System.in);
public static void main (String[]args){
	char Again;
	int Number, Counter;
	do{
	System.out.print("Input number: ");
	Number=Scanner.nextInt();
	if(Number<=0)
       System.out.println("Error, you must input a number higher than 0.");
	else
	   for(Counter=0;Counter<Number;Counter++)
	      System.out.print((Counter+1)+" ");
		do{
			System.out.print("\nTry Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}