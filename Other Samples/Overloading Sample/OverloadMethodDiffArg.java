//OVERLOADING METHOD
public class OverloadMethodDiffArg{
	public static void main(String[]args){
		int mark1=15;
		int mark2=55;
		char grade1='F';
		char grade2='E';
		studResult(mark1,mark2);
		studResult(mark1,mark2,grade1,grade2);
	}
	public static void studResult(int mk1, int mk2){
		System.out.print("The student score "+mk1+" and "+mk2+" for the tests.");
	}
	public static void studresult(int mk1, int mk2, char gr1, char gr2){
		System.out.println(mk1+" is "+gr1+" and "+mk2+" is "+gr2);
	}
}
