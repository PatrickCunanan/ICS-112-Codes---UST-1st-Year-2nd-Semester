public class MultiplicationTable{
	public static void main(String[]args){
		int mTable[][]=new int [5][5];
		for(int i=0; i<5;i++){
			for(int j=0;j<5;j++){
				mTable[i][j]=(i+1)*(j+1);
				System.out.print(mTable[i][j]+"\t");
			}
			System.out.println();
		}
	}
}