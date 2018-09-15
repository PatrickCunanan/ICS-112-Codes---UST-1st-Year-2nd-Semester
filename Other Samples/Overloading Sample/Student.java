//OVERLOADING CONSTRUCTORS
public class Student{
	private String name;
	private int age;
	public Student(String n, int a){
		name=n;
		age=a;
	}
	public Student(String n){
		this(n,0);
	}
	public Student(){
		this("unknown");
	}
	public void display(){
		System.out.println();
		System.out.println("Student name "+name);
		System.out.println("Age "+age);
	}
	public static void main(String[]args){
		Student stud1 = new Student();
		stud1.display();
		Student stud2 = new Student("Mary", 25);
		stud2.display();
		Student stud = new Student("Mark");
		stud.display();
	}
}