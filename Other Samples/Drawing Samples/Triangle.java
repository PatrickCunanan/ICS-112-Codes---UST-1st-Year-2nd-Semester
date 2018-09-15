import java.util.*;
public class Triangle{
	static Scanner S=new Scanner(System.in);
	public static void printstars(int blank,int stars){
		int count=1;
		for (count=1;count<=blank;count++)
			System.out.print(" ");
		for (count=1;count<=stars;count++)
			System.out.print(" *");
		System.out.println();
	}
	public static void main (String[]args){
		int numline,numblank,counter=1;
		System.out.print("enter number of star lines: ");
		numline=S.nextInt();
		System.out.println();
		numblank=30;
		for(counter=1;counter<=numline;counter++){
			printstars(numblank,counter);
			numblank--;
		}
	}
	
}