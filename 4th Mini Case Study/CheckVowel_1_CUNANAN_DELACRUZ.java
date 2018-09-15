/*Cunanan, Patrick Bryan; Dela Cruz Jann Allen
  1CSB
  This program checks if the entered character is a vowel.*/

import java.util.*;
public class CheckVowel_1_CUNANAN_DELACRUZ{
	static Scanner Scan = new Scanner (System.in);
	
	static char Character;
	static boolean invalidInput;
	
	public static void GetInput(){
		
		do {
			invalidInput = false;
			try {
				System.out.print("Input character to be checked: ");
				Character=Scan.next(".").charAt(0);
			} catch (Exception e) {
				System.out.println("Invalid input.");
				invalidInput = true;
				Scan.nextLine();
			}
		}while (invalidInput);
	}		
	
	public static boolean isVowel(){
	   switch(Character) {
          case 'A':
          case 'a':
          case 'E':
          case 'e':
          case 'I':
          case 'i':
          case 'O':
          case 'o':
          case 'U':
          case 'u':
             return true;
        }
       return false;
	}
	
	public static void main (String[]args){
		char Again=0;
		do{
		   GetInput();
		   System.out.println("Is the character "+ Character +" a vowel?: "+ isVowel());
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