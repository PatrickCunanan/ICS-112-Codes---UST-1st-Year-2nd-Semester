import java.util.*;

public class ArraySamples{
	public static void main (String [] args){
		int Array1[] = {1,2,3,4,5,6,7,9};
		int Array2[] = {8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8};
		System.out.print("ARRAY1 VALUES: ");
		for(int array1 : Array1){
			System.out.print(array1+" ");
		}
		System.out.println("");
		System.out.print("ARRAY2 VALUES: ");
		for(int array2 : Array2){
			System.out.print(array2+" ");
		}
		System.out.println("");
		System.arraycopy(Array1, 1, Array2, 1, 7);
		System.out.print("ARRAY2 VALUES after array copying: ");
		for(int array2 : Array2){
			System.out.print(array2+" ");
		}
	}
}