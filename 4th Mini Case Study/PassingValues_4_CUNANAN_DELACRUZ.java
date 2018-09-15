/*Cunanan, Patrick Bryan; Dela Cruz Jann Allen
  1CSB
  This program passes values between two methods.*/

import java.util.Scanner;
public class PassingValues_4_CUNANAN_DELACRUZ {

	static Scanner Scan = new Scanner(System.in);
	static boolean invalidInput;

	public static void main(String[] args) {
		
		int num=0;
		double dec=0;
		char Again=0;
		
		do{
			System.out.println("Method one: " + one(6,8));
			System.out.println("Method two: " + two(num, dec));
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
	
	public static int one(int x, int y) {
	
	if (x < y) {
		return (x+y);
	}
	else
		return ((x-2)*y);
	
	}
	
	public static double two(int x, double a) {
		
		int first;
		double z=0;
		
		do {
			invalidInput = false;
			try {
				System.out.print("Input a number: ");
				z = Scan.nextDouble();
			} catch (Exception e) {
				System.out.println("Invalid input. Please enter a double value");
				invalidInput = true;
				Scan.nextLine();
			}
		}while (invalidInput);
		
		z = z + a;
		
		first = one(6,8);
		first = first + x;
		
		if (z > first*2) {
			return z;
		}
		else
			return ((2*first)-z);
	}
}
	
	
	