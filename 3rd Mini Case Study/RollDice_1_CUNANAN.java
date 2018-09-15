//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program rolls 2 die until it gets the sum the user entered.*/

import java.util.*;
public class RollDice_1_CUNANAN{
	static Scanner Scan = new Scanner (System.in);
	
	static RollDice_1_CUNANAN Roll = new RollDice_1_CUNANAN();
	
	static int Sum;
		
	public static int RollDice(){
		int Number;
		Number=(int)(Math.random()*6)+1;
		return Number;
	}
	
	public static int GetInputSum(){
		System.out.print("Input desired sum to get (Range: 2-12): ");
		Sum=Scan.nextInt();
		while (Sum<2||Sum>12){
			System.out.println("Your input is invalid! Enter again.");
			System.out.print("Input desired sum to get (Range: 2-12): ");
		    Sum=Scan.nextInt();
		}
		return Sum;
	}
	
	public static int TotalSum(int D1, int D2){
		int TotalDice;
		TotalDice=D1+D2;
		return TotalDice;
	}
	
	public static int DiceCounter(int Counter){
		int Dice1,Dice2;
		int RollCounter=0;
		do{
			Dice1=Roll.RollDice();
			Dice2=Roll.RollDice();
			Roll.TotalSum(Dice1, Dice2);
			RollCounter++;
		}while(TotalSum(Dice1, Dice2)!=Sum);
		return RollCounter;
	}
	
	public static void main (String[]args){
		char Again;
		do{
		   int TotalSum;
		   TotalSum=Roll.GetInputSum();
		   System.out.println("The number of times the dice are rolled to get the sum "+Sum+": "+DiceCounter(TotalSum));
		   do{
		      System.out.print("Try Again? (Y/N): ");
	          Again=Scan.next().charAt(0);
		   }while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	    }while(Again=='y'||Again=='Y');
	}
}