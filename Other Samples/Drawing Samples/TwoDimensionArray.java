public class TwoDimensionArray{
	public static void main (String[]args){
		int[][]marks={{23,46,74,37},{55,65,86}};
		System.out.println("The mark stored in element [0][2] is "+marks[1][0]);
		
		for(int i=0;i<marks.length;i++){
			for(int j=0; j< marks[i].length;j++){
				System.out.print(marks[i][j]+"\t");
			}
			System.out.println();
		}
	}
}