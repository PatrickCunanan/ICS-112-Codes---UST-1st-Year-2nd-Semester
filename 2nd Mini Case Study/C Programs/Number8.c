//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This Program is used to convert Farenheit measure into Celsius measure.*/

#include <stdio.h>
void main(){
	float FarenheitMeasure, CelsiusMeasure;
	char Again;
	do{
	printf("Input the temperature in Farenheit measure: ");
	scanf("%f",&FarenheitMeasure);
	
	CelsiusMeasure=((FarenheitMeasure-32)*5)/9;
	
	printf("The temperature in Celsius measure is: %.2fC.\n",CelsiusMeasure);
	
	do{
		printf("Try again? (Y/N): ");
		scanf(" %c",&Again);
	}while (Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
    }while (toupper(Again)=='Y');
    
	getchar();
}
