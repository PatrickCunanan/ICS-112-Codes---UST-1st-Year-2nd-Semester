//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program is used to input a distance in kilometers and convert then output it as miles.*/

import java.util.*;

public class Case1_1_B{
	//Initialization of scanner
	static Scanner Scanner = new Scanner (System.in);
	//Initializing a constant value for Converter
	public final double Converter = 0.62137119;
	//Variables
	public double KilometersMeasure,MilesMeasure;
	//method to get input
	public void GetMeasure(){
		KilometersMeasure=Scanner.nextDouble();
	}
	//method to convert the input
	public void Convertion(){
		MilesMeasure=KilometersMeasure*Converter;
		System.out.format("Distance in miles: %.2f mi",MilesMeasure);
	}
	public static void main(String[] args){
		char Again;
		Case1_1_B Convert = new Case1_1_B();
		do{
		System.out.print("Input distance in kilometers: ");
		Convert.GetMeasure();
		Convert.Convertion();
		System.out.print("\n");
	    do{
			System.out.print("Try Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}


	