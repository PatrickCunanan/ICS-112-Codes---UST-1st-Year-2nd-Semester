import java.util.*;
public class MultiplicationTable2{
	public static void main(String[]args){
		Scanner S = new Scanner(System.in);
		System.out.print("Input row: ");
		int r = S.nextInt();
		System.out.print("Input column: ");
		int c = S.nextInt();
		int mTable[][]=new int [r][c];
		for(int i=0; i<r;i++){
			for(int j=0;j<c;j++){
				mTable[i][j]=(i+1)*(j+1);
				System.out.print(mTable[i][j]+"\t");
			}
			System.out.println();
		}
	}
}