public class ArrayExample3{
	public static void main (String[]args){
		int orig[]={1,2,3,4,5};
		int temp[]={10,9,8,7,6,5,4,3,2,1};
		System.arraycopy(orig,0,temp,0,orig.length);
		orig=temp;
		temp=null;
		System.out.println("Printing the NEW orig array:");
		for (int num:orig){
			System.out.print(num+"\t");
		}
	}
}