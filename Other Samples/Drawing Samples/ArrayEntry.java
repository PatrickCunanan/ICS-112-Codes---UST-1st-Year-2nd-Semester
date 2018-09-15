import java.util.*;
public class ArrayEntry{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int x,count;
		String[] name;
		System.out.print("Number of names to be entered:");
		x=scan.nextInt();
		name=new String[x];
		for (count=0; count<x; ++count){
			System.out.print("Name ["+count+"]:");
			name[count]=scan.next();
		}
		System.out.println("Names stored");
		System.out.println("------------");
		for (count=0;count<name.length;++count){
			System.out.println(name[count]);
		}
	}
}