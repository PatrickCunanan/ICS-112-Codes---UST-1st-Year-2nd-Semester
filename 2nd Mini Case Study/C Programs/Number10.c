//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/* This Program converts an input between 0 - 255 to its 8-bit binary equivalent. */

#include<stdio.h>
int main(){
	int Number,Quotient,Binary[100],Counter1=1,Counter2;
	char Again;
	do{
	printf("Enter decimal number: ");
	scanf("%d",&Number);
	
	if(Number<0||Number>255)
	   printf("Error, your input should be greater than 0 or less than 255.");
	else{
	Quotient=Number;
	
	while(Quotient!=0){
		Binary[Counter1++]=Quotient%2;
		Quotient=Quotient/2;
	}
	printf("Equivalent binary number: ");
	for(Counter2=Counter1-1;Counter2>0;Counter2--)
	   printf("%d",Binary[Counter2]);
	Binary[Counter2] = 0;
    }
    Counter1=1;
    do{
		printf("\nTry again? (Y/N): ");
		scanf(" %c",&Again);
	}while (Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
    }while (toupper(Again)=='Y');    
    
	return 0;
}
