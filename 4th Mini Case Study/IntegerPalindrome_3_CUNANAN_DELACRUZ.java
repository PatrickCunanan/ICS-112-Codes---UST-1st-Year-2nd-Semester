/*Cunanan, Patrick Bryan; Dela Cruz Jann Allen
  1CSB
  This program checks if the entered integer is a palindrome.*/
  
import java.util.*;
public class IntegerPalindrome_3_CUNANAN_DELACRUZ{
	static Scanner Scan = new Scanner (System.in);
	
	static int Integer;
	static boolean invalidInput;
	
	public static void GetInput(){
	
		do {
			do {
				invalidInput = false;
				try {
				System.out.print("Input integer to check: ");
				Integer=Scan.nextInt();
				} catch (Exception e) {
					System.out.println("Invalid input. Please enter a integer value");
					invalidInput = true;
					Scan.nextLine();
				}
			}while (invalidInput);
		}while (Integer < 0);
	}
	
	public static boolean PalindromeCheck(){
		int Palindrome=Integer;
		int Remainder;
		int Reverse=0;
		while(Palindrome!=0){
			Remainder=Palindrome%10;
			Reverse=Reverse*10+Remainder;
			Palindrome=Palindrome/10;
		}
		if(Integer==Reverse){
			return true;
		}
		return false;
	}
	
	public static void main(String[]args){
		
		char Again=0;
		do{
			GetInput();
			System.out.println("Is the integer "+Integer+" a palindrome?: "+PalindromeCheck());
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
	