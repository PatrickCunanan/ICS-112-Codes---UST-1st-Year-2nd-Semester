public class MethodsReturnVal{
	public static void main(String[]args){
		int num1 =20;
		double num2=23.5,result;
		System.out.println("Demonstrating methods with 2 arguments");
		result=calculate(num1,num2);
		System.out.println("The total is "+ result);
	}
	public static double calculate(int no1, double no2){
		double total;
		total=no1+no2;
		return total;
	}
}