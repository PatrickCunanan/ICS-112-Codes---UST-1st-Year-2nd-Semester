//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This program is used to input a distance in kilometers and convert then output it as miles.*/

import java.util.*;
public class Case1_1_A{
static Scanner Scanner = new Scanner (System.in);
public static void main (String[]args){
	char Again;
	final double Converter = 0.62137119;
	double KilometersMeasure, MilesMeasure;
	do{
		System.out.print("Input distance in kilometers: ");
		KilometersMeasure=Scanner.nextFloat();
		MilesMeasure=KilometersMeasure*Converter;
		System.out.format("Distance in miles: %.2f mi\n",MilesMeasure);
		do{
			System.out.print("Try Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}