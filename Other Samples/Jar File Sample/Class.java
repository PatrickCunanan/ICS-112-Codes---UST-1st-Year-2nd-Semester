import java.util.*;

public class Class{
	static Scanner Scan = new Scanner (System.in);
	public int Number1;
	public int Number2;
	public int Sum;
	public void Scanner(){
		System.out.print("Input Number 1: ");
		Number1=Scan.nextInt();
		System.out.print("Input Number 2: ");
		Number2=Scan.nextInt();
	}
	public void AddMethod(){
		Sum=Number1+Number2;
		System.out.printf("The sum of %d and %d is %d",Number1,Number2,Sum);
	}
}