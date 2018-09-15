public class ArrayAssign{
	public static void main (String [] args){
		int[] num = new int [3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		System.out.println("The numbers are:");
		for (int i=0;i<num.length;++i){
			System.out.println(num[i]);
		}
	}
}