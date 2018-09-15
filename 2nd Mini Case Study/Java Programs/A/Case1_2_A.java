//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program is used to compute the wage paid under each plan and announcing the best paying plan.*/

import java.util.*;
public class Case1_2_A{
static Scanner Scanner = new Scanner (System.in);
public static void main (String[]args){
	char Again;
	float WeeklySales;
    double Plan2, Plan3;
	int Plan1=300;
	do{
		System.out.print("Input weekly sales: ");
		WeeklySales=Scanner.nextFloat();
		Plan2=(3.50*4.2)+(WeeklySales*.10);
	    Plan3=WeeklySales*.15;
		System.out.println("Plan 1: P"+Plan1);
		System.out.println("Plan 2: P"+Plan2);
		System.out.println("Plan 3: P"+Plan3);
		
		if (Plan1>Plan2&&Plan1>Plan3)
		   System.out.println("Plan 1 is the best paying plan.\n");
	    else if(Plan2>Plan1&&Plan2>Plan3)
	       System.out.println("Plan 2 is the best paying plan.\n");
	    else if (Plan3>Plan1&&Plan3>Plan2)
		   System.out.println("Plan 3 is the best paying plan.\n");
	    		
		do{
			System.out.print("Try Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}