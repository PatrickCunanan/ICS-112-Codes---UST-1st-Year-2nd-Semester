import java.util.*;

public class multitable{
public static void main (String [] args){
	int rows, columns, rowscounter, columncounter;
	
	System.out.print("enter number of rows: ");
	rows = new Scanner(System.in).nextInt();
	System.out.print("enter number of columns: ");
	columns = new Scanner(System.in).nextInt();
	int table [][] = new int[rows][columns];
	 
	 for (rowscounter = 0; rowscounter < rows; rowscounter++){
		for (columncounter = 0; columncounter < columns; columncounter++) {
			table [rowscounter][columncounter] = (rowscounter + 1) * (columncounter +1);
			System.out.print(table[rows][columns] +"\t");
		}
		System.out.println();
	 }
}
}