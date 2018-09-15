import java.util.*;
public class RectangleInput{
	public static void main (String [] args){
		Scanner Scan = new Scanner (System.in);
		int i, j, m, n;
		System.out.println("Input m: ");
		m=Scan.nextInt();
		System.out.println("Input n: ");
		n=Scan.nextInt();
		for(i=0;i<n;i++){
		   System.out.print("*");	
           for(j=0;j<m;j++){
              if(i==0 || i==n-1)
                 System.out.print("*");
              else
                 System.out.print(" ");
            }
           System.out.print("*");			
           System.out.print("\n");
        }
	}
}