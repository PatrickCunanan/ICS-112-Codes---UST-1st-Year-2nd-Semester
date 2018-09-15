//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program is used to compute the odd numbers between 1 and 15.*/

import java.util.*;

public class Case1_6_B{
	//initialization of scanner
	static Scanner Scanner = new Scanner(System.in);
	//initialization of integers
	public int Number,Counter;
	//assigning a value to an integer type variable
	public int ProductCounter=1;
	//method to get input
	public void GetNumber(){
		Number=Scanner.nextInt();
	}
	//method to display the product
	public void OddProductDisplay(){
		for(Counter=1;Counter<=Number;Counter+=2){
	       System.out.print(Counter+" ");
	       ProductCounter*=Counter;
	 }
	 System.out.print("\n");
	 System.out.println("Product is "+ ProductCounter);
	 ProductCounter=1;
  }
    public static void main(String [] args){
		char Again;
		Case1_6_B Product = new Case1_6_B();
		do{
		System.out.print("Enter a number between 1 and 15: ");
		Product.GetNumber();
		if(Product.Number<=0||Product.Number>15)
			System.out.println("Error, your input should be greater than 0 or less than 15.\n");
		else{
			Product.OddProductDisplay();
			System.out.print("\n");
		}
		do{
			System.out.print("Try Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}
