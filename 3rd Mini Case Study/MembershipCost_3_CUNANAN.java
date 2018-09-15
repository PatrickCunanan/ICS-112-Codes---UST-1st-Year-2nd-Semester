//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program computes the membership fee of a user based on his\her inputs.*/

import java.util.*;
public class MembershipCost_3_CUNANAN{
	static Scanner Scan = new Scanner(System.in);
	
	static int Choice, Choice1, Choice2, SessionCount;
	
	static double MembershipFee, SessionFee, Bill, DiscountSessionFee;
	
	public static void DisplayMenu(){
		
		System.out.println("============================PATRICK'S FITNESS CENTER============================");
		System.out.print("Welcome to Patrick's Fitness Center! We ensure you great service when you join  us today.");
		System.out.print("\nWe offer a 30% discount to our dear Senior Citizens. And we also give a 15%     discount if ");
		System.out.print("you pay 12 or more months in advance.\nBut if you are only buying personal sessions, you can ");
		System.out.println("have a 20% discount on    each session if you buy more than 5 sessions.");
		System.out.print("Are you (1)going to apply for membership or (2)going to buy personal training   sessions?(1 or 2): ");
		Choice=Scan.nextInt();
		while(Choice<1||Choice>2){
			System.out.println("You must only input 1 or 2.");
			System.out.print("Are you (1)going to apply for membership or (2)going to buy personal training sessions?(1 or 2): ");
		    Choice=Scan.nextInt();
		}
	}
	
	public static void GetInput(){
		if (Choice==1){
			System.out.println("Membership Application:");
			System.out.print("How much is the fee?: ");
			MembershipFee=Scan.nextDouble();
			while(MembershipFee<0){
			   System.out.println("Fee cannot be Negative!");
			   System.out.print("How much is the fee?: ");
			   MembershipFee=Scan.nextDouble();
			}
			System.out.print("Are you a Senior Citizen? (Input 1 for YES and 2 for NO): ");
			Choice1=Scan.nextInt();
			while(Choice1<1||Choice1>2){
			   System.out.println("You must only input 1 or 2.");
			   System.out.print("Are you a Senior Citizen? (Input 1 for YES and 2 for NO): ");
		       Choice1=Scan.nextInt();
		    }
			System.out.print("Did you buy your membership 12 or more months in advance? (Input 1 for YES and 2for NO): ");
			Choice2=Scan.nextInt();
			while(Choice2<1||Choice2>2){
			   System.out.println("You must only input 1 or 2.");
			   System.out.print("Did you buy your membership 12 or more months in advance? (Input 1 for YES and 2for NO): ");
		       Choice2=Scan.nextInt();
		    }
		}
		else if(Choice==2){
			System.out.println("Purchase Personal Sessions:");
			System.out.print("How much is one session?: ");
			SessionFee=Scan.nextDouble();
			while(SessionFee<0){
			   System.out.println("Fee cannot be Negative!");
			   System.out.print("How much is one session?: ");
			   SessionFee=Scan.nextDouble();
			}
			System.out.print("How many sessions are you going to purchase?: ");
			SessionCount=Scan.nextInt();
			while(SessionCount<1){
			   System.out.print("How many sessions are you going to purchase?: ");
			   SessionCount=Scan.nextInt();
			}
		}
	}
	
	public static double ComputeFee(int Choose){
		double Discount1, Discount2, SessionsTotal;
		if (Choose==1){
			if (Choice1==1&&Choice2==1){
				Discount1=(MembershipFee*.3);
				Discount2=(MembershipFee*.15);
				Bill=MembershipFee-Discount1-Discount2;
			}
			else if (Choice1==1&&Choice2==2){
				Discount1=(MembershipFee*.3);
				Bill=MembershipFee-Discount1;
			}
			else if (Choice1==2&&Choice2==1){
				Discount2=(MembershipFee*.15);
				Bill=MembershipFee-Discount2;
			}
			else if (Choice1==2&&Choice2==2){
				Bill=MembershipFee;
			}
		}
		else if (Choose==2){
			if (SessionCount>5){
				Discount1=SessionFee*.2;
				DiscountSessionFee=SessionFee-Discount1;
				Bill=DiscountSessionFee*SessionCount;
			}
			else{
				Bill=SessionFee*SessionCount;
			}
		}
		return Bill;
	}
	
	public static void main(String[]args){
		MembershipCost_3_CUNANAN Fee = new MembershipCost_3_CUNANAN();
		char Again;
		do{
		   Fee.DisplayMenu();
	 	   Fee.GetInput();
		   System.out.println("Total bill is: P"+ComputeFee(Choice));
		   do{
		      System.out.print("Try Again? (Y/N): ");
	          Again=Scan.next().charAt(0);
		   }while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	    }while(Again=='y'||Again=='Y');
	}
}