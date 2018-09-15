//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program is used to compute the wage paid under each plan and announcing the best paying plan.*/

import java.util.*;
import java.io.*;

public class Case1_2_B{
	//Initialization of scanner
	static Scanner Scanner = new Scanner (System.in);
	//initialize a float variable
	public float WeeklySales;
    //initialize 2 double variables
	public double Plan2, Plan3;
	//initialize a constant value to a variable
	public final int Plan1=300;
	//method to get user input
	public void GetSales(){
	    WeeklySales=Scanner.nextFloat();
	}
	//method to compute for Plan 2
	public void Plan2Computation(){
		Plan2=(3.50*4.2)+(WeeklySales*.10);
	}
	//method to compute for Plan 3
	public void Plan3Computation(){
		Plan3=WeeklySales*.15;
	}
	//method to display Plans
	public void DisplayPlans(){
		System.out.println("Plan 1: P"+Plan1);
		System.out.println("Plan 2: P"+Plan2);
		System.out.println("Plan 3: P"+Plan3);
	}
	//method that chooses the best plan
	public void BestPlanChooser(){
		if (Plan1>Plan2&&Plan1>Plan3)
		   System.out.println("Plan 1 is the best paying plan.\n");
	    else if(Plan2>Plan1&&Plan2>Plan3)
	       System.out.println("Plan 2 is the best paying plan.\n");
	    else if (Plan3>Plan1&&Plan3>Plan2)
		   System.out.println("Plan 3 is the best paying plan.\n");
	}
	public static void main(String[] args){
		char Again;
		Case1_2_B Plans = new Case1_2_B();
		do{
		System.out.print("Input weekly sales: ");
		Plans.GetSales();
		Plans.Plan2Computation();
		Plans.Plan3Computation();
		Plans.DisplayPlans();
		Plans.BestPlanChooser();
		 do{
			System.out.print("Try Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}