/*CRUZ, Jericho Janssen L.
  CUNANAN, Patrick Bryan F.
  MACALINO, Brendel Jeorge F.
  MALONZO, Marc Denzel S.
  REYES, Raiden Karl Mordecai D.
  RICO, Maeric Eulex R.
  1CSB
  Main Case Study Problem 1: This program is a game that generates a "Magic" number and the user must guess the generated number. The user has 5 tries
  until he/she looses the game.*/

import java.util.*;

public class GuessTheMagicNumber{
	public static void main (String[]args)throws Exception{
		Scanner Scan = new Scanner(System.in);
		int NoOfTries=5;
		int GuessNumber, Difference;
		char Again;
		do{
			int MagicNumber = (int)(Math.random()*51);
			System.out.println("                    *****     GUESS THE MAGIC NUMBER     *****                    ");
			System.out.println("Instructions:");
			System.out.print("The program will generate a number between the numbers 0 and 50.");
			System.out.print(" You must input a number within the given range and guess the number.");
			System.out.println(" You have 5 tries to guess the magic number. Good luck!");
			do{
				System.out.println("Tries left: "+NoOfTries);
				System.out.print("Input guess: ");
				GuessNumber=Scan.nextInt();
				Difference=MagicNumber-GuessNumber;
				Difference=Math.abs(Difference);
				while((GuessNumber>50)||(GuessNumber<0)){
				if(GuessNumber>50){
					System.out.println("Your input is above the range!");
					System.out.print("Input another guess: ");
				    GuessNumber=Scan.nextInt();
				}
				else if(GuessNumber<0){
					System.out.println("Your input is below the range!");
					System.out.print("Input another guess: ");
				    GuessNumber=Scan.nextInt();
				}
				}
				if((GuessNumber>MagicNumber)&&(Difference>=30)){
					System.out.println("Your guess "+GuessNumber+" is higher than the number.");
					System.out.println("Clue: Your guess is VERY HIGH compared to the magic number.");
				}
				else if((GuessNumber>MagicNumber)&&(Difference<30&&Difference>=15)){
					System.out.println("Your guess "+GuessNumber+" is higher than the number.");
					System.out.println("Clue: Your guess is HIGH compared to the magic number.");
				}
				else if((GuessNumber>MagicNumber)&&(Difference<15&&Difference>=10)){
					System.out.println("Your guess "+GuessNumber+" is higher than the number.");
					System.out.println("Clue: Your guess is MODERATELY HIGH compared to the magic number.");
				}
				else if((GuessNumber>MagicNumber)&&(Difference<10&&Difference>=0)){
					System.out.println("Your guess "+GuessNumber+" is higher than the number.");
					System.out.println("Clue: Your guess is SOMEWHAT HIGH compared to the magic number.");
				}
				else if((GuessNumber<MagicNumber)&&(Difference>=30)){
					System.out.println("Your guess "+GuessNumber+" is lower than the number.");
					System.out.println("Clue: Your guess is VERY LOW compared to the magic number.");
				}
				else if((GuessNumber<MagicNumber)&&(Difference<30&&Difference>=15)){
					System.out.println("Your guess "+GuessNumber+" is lower than the number.");
					System.out.println("Clue: Your guess is LOW compared to the magic number.");
				}
				else if((GuessNumber<MagicNumber)&&(Difference<15&&Difference>=10)){
					System.out.println("Your guess "+GuessNumber+" is lower than the number.");
					System.out.println("Clue: Your guess is MODERATELY LOW compared to the magic number.");
				}
				else if((GuessNumber<MagicNumber)&&(Difference<10&&Difference>=0)){
					System.out.println("Your guess "+GuessNumber+" is lower than the number.");
					System.out.println("Clue: Your guess is SOMEWHAT LOW compared to the magic number.");
				}
				else if(GuessNumber==MagicNumber){
					System.out.println("Your guess "+GuessNumber+" is CORRECT!");
					System.out.println("CONGRATULATIONS!");
				}
				NoOfTries--;
			}while((NoOfTries!=0)&&(GuessNumber!=MagicNumber));
            if((NoOfTries==0)&&(MagicNumber!=GuessNumber)){
				System.out.println("The Magic Number is "+MagicNumber);
				System.out.println("YOU LOSE!");
			}
            NoOfTries=5;			
			do{
				System.out.print("Do you want to play again? (Y/N): ");
				Again=(char)System.in.read();
				System.in.read();System.in.read();
				Again=Character.toUpperCase(Again);
			}while((Again!='Y')&&(Again!='N'));
		}while(Again=='Y');
	}
}