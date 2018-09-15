public class MethodSingleArgs{
	public static void main(String[]args){
		int number=20;
		System.out.println("Demonstrating method with one argument");
		calculate(30);
		calculate(number);
	}
	public static void calculate(int num){
		int total;
		total=num+3;
		System.out.println("Total is "+total);
	}
}