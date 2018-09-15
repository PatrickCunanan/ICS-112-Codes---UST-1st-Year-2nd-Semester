import java.util.*;

public class VPattern{
	public static void main (String [] args){
		int Counter, Counter1, Counter2, Number, Space;
		System.out.print("Please enter a number: ");
		Number = new Scanner(System.in).nextInt();
		Space = (Number -1) + (Number -2);
		for (Counter =1; Counter <= Number; Counter ++){
			System.out.print("*");
			for (Counter1 =1; Counter1 <= Space; Counter1 ++){
				System.out.print(" ");
			}
			Space = Space - 2;
			if (Counter1 != Number) System.out.println("*");
			if (Counter1 == Number) break; 
			for (Counter2 = 1; Counter2 <=Counter; Counter2++){
				System.out.print(" ");
			}
		}
	}
}