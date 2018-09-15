//Cunanan, Patrick Bryan F.
//1CS-B 2014069410
/*This Program displays a n by n square according to the input of the user.*/

#include <stdio.h>
void main(){
	int Number,Counter1,Counter2;
	char Again;
	do{
	printf("Input n: ");
	scanf("%d",&Number);
	if(Number==0||Number<0)
	   printf("Error, your input should not be a negative number.");
	else
	printf("\n");
	for(Counter1=0;Counter1<Number;Counter1++){
	   for(Counter2=0;Counter2<Number;Counter2++){
	      printf("*");
	  }
	    printf("\n");
	}
	do{
		printf("\nTry again? (Y/N): ");
		scanf(" %c",&Again);
	}while (Again!='y'&&Again!='Y'&&Again!='n'&&Again!='N');
    }while (toupper(Again)=='Y');    
    
	getchar();
}
