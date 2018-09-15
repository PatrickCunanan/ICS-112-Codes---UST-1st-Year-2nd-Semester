//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program is used to input a family income and determine if family is poor, middle or rich.*/

import java.util.*;

public class Case1_3_B{
	//Initialization of scanner
	static Scanner Scanner = new Scanner (System.in);
	//initialization of a float variable
	float FamilyIncome;
	//method to get input
	public void GetIncome(){
       FamilyIncome=Scanner.nextFloat();
	}
	//method to choose the class
	void ClassChooser(){
		if (FamilyIncome<12000)
		   System.out.println("Family Class: Poor");
	    else if (FamilyIncome>=1200&&FamilyIncome<=70000)
		   System.out.println("Family Class: Middle Class");
	    else if (FamilyIncome>70000)
		   System.out.println("Family Class: Rich");
	}
	public static void main (String[] args){
	   char Again;
	   	   Case1_3_B IncomeClass = new Case1_3_B();
	   do{
	   System.out.print("Input family income: ");
	   IncomeClass.GetIncome();
	   if (IncomeClass.FamilyIncome<=0)
		   System.out.println("Error, your input must be higher than 0.");
	   else
	       IncomeClass.ClassChooser();
	   do{
			System.out.print("Try Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}