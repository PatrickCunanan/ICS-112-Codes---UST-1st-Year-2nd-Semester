//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program is used to input a family income and determine if family is poor, middle or rich.*/

import java.util.*;
public class Case1_3_A{
static Scanner Scanner = new Scanner (System.in);
public static void main (String[]args){
	char Again;
	float FamilyIncome;
	do{
		System.out.print("Input family income: ");
		FamilyIncome=Scanner.nextFloat();
		if (FamilyIncome<0)
			System.out.println("Error, you entered a negative number.");
		else{
		  if (FamilyIncome<12000)
		   System.out.println("Family Class: Poor");
	      else if (FamilyIncome>=1200&&FamilyIncome<=70000)
		   System.out.println("Family Class: Middle Class");
	      else if (FamilyIncome>70000)
		   System.out.println("Family Class: Rich");
		}
		do{
			System.out.print("Try Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}