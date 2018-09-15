//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This Program is used to convert Farenheit measure into Celsius measure.*/

import java.util.*;

public class Case2_8_B{
	//initialization of scanner
	static Scanner Scanner = new Scanner (System.in);
	//initialization of float variables
	float FarenheitMeasure, CelsiusMeasure;
	//method to get farenheit temperature
	public void GetTemperature(){
	   FarenheitMeasure=Scanner.nextFloat();
	}
	//method to convert and display the answer
	public void CelsiusConvert(){
		CelsiusMeasure=((FarenheitMeasure-32)*5)/9;
		System.out.printf("The temperature in Celsius measure is: %.2fC.\n",CelsiusMeasure);
	}
	public static void main (String [] args){
		char Again;
		Case2_8_B Temperature = new Case2_8_B();
		do{
		System.out.print("Input the temperature in Farenheit measure: ");
	    Temperature.GetTemperature();
		Temperature.CelsiusConvert();
		do{
			System.out.print("Try Again? (Y/N): ");
			Again=Scanner.next().charAt(0);
		}while(Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
	}while(Again=='y'||Again=='Y');
}
}
