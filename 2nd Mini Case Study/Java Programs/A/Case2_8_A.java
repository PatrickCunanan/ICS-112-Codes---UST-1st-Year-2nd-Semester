//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This Program is used to convert Farenheit measure into Celsius measure.*/

import java.util.*;
public class Case2_8_A{
static Scanner Scanner = new Scanner (System.in);
public static void main (String[]args){
	char Again;
	float FarenheitMeasure, CelsiusMeasure;
	do{
	System.out.print("Input the temperature in Farenheit measure: ");
	FarenheitMeasure=Scanner.nextFloat();
	
	CelsiusMeasure=((FarenheitMeasure-32)*5)/9;
	
	System.out.printf("The temperature in Celsius measure is: %.2fC.\n",CelsiusMeasure);
		do{
			System.out.print("\nTry Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}