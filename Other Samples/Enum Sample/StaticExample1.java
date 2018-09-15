 public class StaticExample1
 {
 public static int counter = 0;
 private int serialNumber;
 public StaticExample1() {
 counter++;
 serialNumber = counter;
 }


 public static void main(String args[]) {
 System.out.println("Creating the first object: ");
 StaticExample1 se1 = new StaticExample1();
 System.out.println("Creating the second object: ");
 StaticExample1 se2 = new StaticExample1();
 System.out.println("A total of "
					+ counter + " were created.");
					
 }
 }

