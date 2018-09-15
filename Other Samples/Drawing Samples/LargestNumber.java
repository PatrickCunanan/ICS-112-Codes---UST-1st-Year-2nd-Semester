import java.util.*;
public class LargestNumber{
	static Scanner s = new Scanner(System.in);
	public static void main (String[]args){
		double num,max;
		int count;
		System.out.println("Enter 10 numbers: ");
		
		num=s.nextDouble();
		max=num;
		for(count=1;count<10;count++){
			num=s.nextDouble();
			max=larger(max,num);
		}
		System.out.println("The largest number is "+ max);
	}
	public static double larger(double x, double y){
		double max;
		if(x>=y)
			max=x;
		else
			max=y;
		return max;
	}
}