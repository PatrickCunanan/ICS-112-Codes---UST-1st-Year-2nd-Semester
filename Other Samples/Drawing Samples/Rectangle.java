import java.util.*;
public class Rectangle{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		int width, length,i,j;
		System.out.print("Input width: ");
		width=scan.nextInt();
		System.out.print("Input length: ");
		length=scan.nextInt();
		
		for(i=0;i<length;i++){
			System.out.print("*");
			for(j=0;j<width;j++){
				if(i==0||i==length-1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("*");
			System.out.println("");
		}
		
	}
}