/*Cunanan, Patrick Bryan; Dela Cruz Jann Allen
  1CSB
  This program display the billing ammount of a user according to his inputs.*/
 
import java.util.Scanner;
public class AccountingFirm_5_CUNANAN_DELACRUZ {
	
	static Scanner Scan = new Scanner(System.in);
	static boolean invalidInput;
	
	public static double taxCalculate () {
		
		double dHourlyRate=0;
		double dConsultingTime=0;
		char clowIncome=0;
		double dtotalCost=0;
		
		System.out.println("Welcome to the J&J accounting firm.\n");
		
		do {
			do {
				invalidInput = false;
				try {
					System.out.print("How much is the hourly rate? ");
					dHourlyRate = Scan.nextDouble();
				} catch (Exception e) {
					System.out.println("Invalid input. Please enter a double value");
					invalidInput = true;
					Scan.nextLine();
				}
			}while (invalidInput);
		}while(dHourlyRate < 0);
		
		do {
			do {
				invalidInput = false;
				try {
					System.out.print("Input total consulting time in minutes: ");
					dConsultingTime = Scan.nextInt();
				} catch (Exception e) {
					System.out.println("Invalid input. Please enter an int value");
					invalidInput = true;
					Scan.nextLine();
				}
			}while (invalidInput);
		}while (dConsultingTime < 0);
		
		do {
			invalidInput = false;
			try {
				System.out.println("Do you have a low income? (Income less than $25,000)");
				do {
					System.out.print("Y/N? ");
					clowIncome = Scan.next().charAt(0);
					clowIncome = Character.toUpperCase(clowIncome);
				}while(clowIncome!='y'&&clowIncome!='Y'&&clowIncome!='n'&&clowIncome!='N');
			} catch (Exception e) {
				System.out.println("Invalid input.");
				invalidInput = true;
				Scan.nextLine();
			}
		}while (invalidInput);
		
			if (clowIncome == 'Y') {
				if (dConsultingTime <= 30) {
			
				dtotalCost = 0;
				}
				else
				dtotalCost = (dHourlyRate * 0.40) * ((dConsultingTime-30)/60);
			}
			else if (clowIncome == 'N') {
				if (dConsultingTime <= 20) {
				dtotalCost = 0;
				}
				else
				dtotalCost = (dHourlyRate * 0.70) * ((dConsultingTime-20)/60);
			}
		
		return dtotalCost;
	}
	
	public static void main (String[] args) {
	
		char Again=0;
		
		do {
			System.out.println("The total bill is: $" + taxCalculate());
			do {
				invalidInput = false;
				try {
				
					do{
					System.out.print("Try Again? (Y/N): ");
					Again=Scan.next().charAt(0);
					}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
					
				} catch (Exception e) {
					System.out.println("Invalid input.");
					invalidInput = true;
					Scan.nextLine();
				}
			}while (invalidInput);
	    }while(Again=='y'||Again=='Y');
	}
}