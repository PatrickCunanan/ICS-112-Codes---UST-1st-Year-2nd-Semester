/*CRUZ, Jericho Janssen L.
  CUNANAN, Patrick Bryan F.
  MACALINO, Brendel Jeorge F.
  MALONZO, Marc Denzel S.
  REYES, Raiden Karl Mordecai D.
  RICO, Maeric Eulex R.
  1CSB
  Main Case Study Problem 3: This program gets an input of the service that the user used and the number of minutes the user used depending on the service
  selected. It then outputs a telephone bill with the cost of the calls the user made.*/


import java.util.Scanner;
import java.lang.String;

public class TelephoneBill{
	public static void main(String[]args) throws Exception{
		Scanner Scan = new Scanner (System.in);
		String AccountNumber;
		char ServiceCode;
		double RegularMinutes, RegularAmount, RegularExceed;
		double PremiumMinutesDay, PremiumMinutesNight;
		double PremiumDayAmount=0, PremiumNightAmount=0, PremiumFinalAmount;
		char Again;
		do{
		   System.out.println("                    *****     TELEPHONE BILL     *****                    ");
		   System.out.print("Enter your 6-number account code (XXXXXX): ");
		   AccountNumber=Scan.next();
		   while((AccountNumber.length()!=6)||(!AccountNumber.matches("[0-9]+"))){
			   System.out.println("INVALID ACCOUNT NUMBER!");
			   System.out.print("Enter your 6-number account code (XXXXXX): ");
			   AccountNumber=Scan.next();
	       }
		   System.out.print("Input Service Code (Premium - P//Regular - R): ");
		   ServiceCode=(char)System.in.read();
		   System.in.read();System.in.read();
		   ServiceCode=Character.toUpperCase(ServiceCode);
		   while(ServiceCode!='P' && ServiceCode!='R'){
			   System.out.println("INVALID SERVICE CODE!");
			   System.out.print("Input Service Code (Premium - P//Regular - R): ");
			   ServiceCode=(char)System.in.read();
		       System.in.read();System.in.read();
			   ServiceCode=Character.toUpperCase(ServiceCode);
		   }
		   if (ServiceCode=='R'){
			   System.out.print("Input number of minutes consumed: ");
			   RegularMinutes=Scan.nextDouble();
			   while(RegularMinutes<0){
				   System.out.println("INVALID INPUT!");
				   System.out.print("Input number of minutes consumed: ");
			       RegularMinutes=Scan.nextDouble();
			   }
			   if (RegularMinutes<=50){
				   RegularAmount=10;
				   System.out.println("\nACCOUNT NUMBER: "+AccountNumber+"\t\tService Code: R (REGULAR)");
				   System.out.println("Total number of minutes consumed: "+RegularMinutes+" mins.");
				   System.out.format("Total Bill: PHP %.2f",RegularAmount);
			   }
			   else if(RegularMinutes>50){
				   RegularExceed=(RegularMinutes-50)*0.75;
				   RegularAmount=RegularExceed+10;
				   System.out.println("\nACCOUNT NUMBER: "+AccountNumber+"\t\tService Code: R (REGULAR)");
				   System.out.println("Total number of minutes consumed: "+RegularMinutes+" mins.");
				   System.out.format("Total Bill: PHP %.2f",RegularAmount);
			   }
		   }
		   else if (ServiceCode=='P'){
			   System.out.print("Input number of minutes consumed during 6:00 am - 6:00pm: ");
			   PremiumMinutesDay=Scan.nextDouble();
			   while(PremiumMinutesDay<0){
				   System.out.println("INVALID INPUT!");
				   System.out.print("Input number of minutes consumed during 6:00 am - 6:00pm: ");
			       PremiumMinutesDay=Scan.nextDouble();
			   }
			   System.out.print("Input number of minutes consumed during 6:01 pm - 5:59am: ");
			   PremiumMinutesNight=Scan.nextDouble();
			   while(PremiumMinutesNight<0){
				   System.out.println("INVALID INPUT!");
				   System.out.print("Input number of minutes consumed during 6:01 pm - 5:59am: ");
			       PremiumMinutesNight=Scan.nextDouble();
			   }
			   if(PremiumMinutesDay<=75){
				   PremiumDayAmount=0;
			   }
			   else if(PremiumMinutesDay>75){
				   PremiumDayAmount=(PremiumMinutesDay-75)*0.20;
			   }
			   if(PremiumMinutesNight<=100){
				   PremiumNightAmount=0;
			   }
			   else if(PremiumMinutesDay>100){
				   PremiumNightAmount=(PremiumMinutesNight-100)*0.15;
			   }
			   PremiumFinalAmount = PremiumDayAmount + PremiumNightAmount + 25;
			
			   System.out.println("\nACCOUNT NUMBER: "+AccountNumber+"\t\tService Code: P (PREMIUM)");
		       System.out.println("Total number of minutes consumed during 6:00 am - 6:00pm: "+PremiumMinutesDay+" mins.");
			   System.out.println("Total number of minutes consumed during 6:01 pm - 5:59am: "+PremiumMinutesNight+" mins.");
			   System.out.format("Total Bill: PHP %.2f",PremiumFinalAmount);
		   }
		   do{
			   	System.out.print("\n\nDo you want to try again? (Y/N): ");
				Again=(char)System.in.read();
				System.in.read();System.in.read();
				Again=Character.toUpperCase(Again);
			}while((Again!='Y')&&(Again!='N'));
		}while(Again=='Y');
	}
}