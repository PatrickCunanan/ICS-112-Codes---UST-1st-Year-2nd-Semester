


public class NewEnum {
public static void main(String args[]) {
	for (Answers answer : Answers.values()) {
	switch(answer) {
	case YES : System.out.println("Yes");
	break;
	case NO : System.out.println("No");
	break;
	case MAYBE : System.out.println("Maybe");
	break;
}
}
}
}
