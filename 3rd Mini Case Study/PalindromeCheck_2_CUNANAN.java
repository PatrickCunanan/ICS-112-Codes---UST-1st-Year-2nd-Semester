//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program checks if string is a palindrome*/

import java.util.*;
public class PalindromeCheck_2_CUNANAN{
	static Scanner Scan = new Scanner (System.in);
	
	static String PalindromeString,CapitalPalindromeString;
	
	public static void GetString(){
		System.out.print("Input string to be checked: ");
		PalindromeString=Scan.next();
		CapitalPalindromeString=PalindromeString.toUpperCase();
	}
	
	public static boolean PalindromeCheck(String Pal){
		int Length = Pal.length();
		int Counter1, Counter2;
		Counter2=Length-1;
		for (Counter1=0;Counter1<=(Length-1)/2;Counter1++){
			   if (Pal.charAt(Counter1)!=Pal.charAt(Counter2))
				   return false;
				   Counter2--;
		}
		   return true;
	    
	}
	
	public static void main (String[]args){
		PalindromeCheck_2_CUNANAN Palindrome = new PalindromeCheck_2_CUNANAN();
		char Again;
		do{
		   Palindrome.GetString();
		   System.out.println("Is "+PalindromeString+" a palindrome?: "+PalindromeCheck(CapitalPalindromeString));
		   do{
		      System.out.print("Try Again? (Y/N): ");
	          Again=Scan.next().charAt(0);
		   }while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	    }while(Again=='y'||Again=='Y');
	}
}