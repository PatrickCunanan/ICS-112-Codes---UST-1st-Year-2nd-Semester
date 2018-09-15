public class MethodsMultipleArgs{
	public static void main (String[]args){
		int num1= 20;
		double num2=23.5;
		System.out.println("Demonstrating methods with 2 arguments");
		calculate(num1,num2);
	}
	public static void calculate(int no1,double no2){
		double total;
		total=no1+no2;
		System.out.println("Total is "+total);
	}
}