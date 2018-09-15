/*Cunanan, Patrick Bryan; Dela Cruz Jann Allen
  1CSB
  This program displays the number of vowels the entered string contains.*/
  
import java.util.*;
public class CountVowel_2_CUNANAN_DELACRUZ{
	static Scanner Scan = new Scanner(System.in);
	
	static String VowelString;
	static boolean invalidInput;
	
	public static void GetInput(){
		do {
			invalidInput = false;
			try {
			System.out.print("Input string of characters: ");
			VowelString=Scan.next();
			} catch (Exception e) {
				System.out.println("Invalid input.");
				invalidInput = true;
				Scan.nextLine();
			}
		}while (invalidInput);
	}
	
	public static int isVowel(){
		int Length=VowelString.length();
		int Counter, VowelCounter=0;
		for(Counter=0;Counter<Length;Counter++){
			switch(VowelString.charAt(Counter)){
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
				   VowelCounter++;
			}
		}
		return VowelCounter;
	}
	
	public static void main (String[]args){
		char Again=0;
		do{
			GetInput();
			System.out.println("The number of vowels in the string: "+isVowel());
			
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