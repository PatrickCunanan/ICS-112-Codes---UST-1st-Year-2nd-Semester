import java.io.*;
import java.util.*;
public class Ch10_PrExercise6
{
static Scanner console = new Scanner(System.in);
public static void main(String[] args) throws FileNotFoundException
{
AddressBook addressBook = new AddressBook();
String str;
String str1;
String str2;
int choice;
int loc;
int month;
loadAddressBook(addressBook);
addressBook.sort();
showMenu();
choice = console.nextInt();
console.nextLine();
while (choice != 9)
{
switch (choice)
{
case 1: System.out.print("Enter the last name of the person: ");
str = console.nextLine();
System.out.println();
loc = addressBook.search(str);
if (loc != -1)
System.out.println(str + " is in the address book");
else
	System.out.println(str + " is not in the address book");
break;
case 2: System.out.print("Enter the last name of the person: ");
str = console.nextLine();
System.out.println();
loc = addressBook.search(str);
if (loc != -1)
addressBook.printAt(loc);
else
System.out.println(str + " is not in the address book");
break;
case 3: System.out.print("Enter the month number: ");
month = console.nextInt();
console.nextLine();
System.out.println();
addressBook.printNameInTheMonth(month);
break;
case 4: System.out.print("Enter starting last name: ");
str1 = console.nextLine();
System.out.println();
System.out.print("Enter ending last name: ");
str2 = console.nextLine();
System.out.println();
addressBook.printNamesBetweenLastNames(str1, str2);
break;
case 5: System.out.print("Enter person type Family, Friend, Business: ");
str = console.nextLine();
System.out.println();
addressBook.printNamesWithStatus(str);
break;
case 6: addressBook.print();
break;
case 7: saveData(addressBook);
break;
default: System.out.println("Invalid choice.");
}
showMenu();
choice = choice = console.nextInt();
console.nextLine();
}
char response;
System.out.print("Save data Yes (Y/y) No(N/n)?: ");
response = console.nextLine().charAt(0);
System.out.println();
if (response == 'y' || response == 'Y')
saveData(addressBook);
}
public static void loadAddressBook(AddressBook adBook) throws
FileNotFoundException
{
Scanner inFile = new Scanner(new FileReader("Ch10_Ex6Data.txt"));
String first;
String last;
int month;
int day;
int year;
String street;
String city;
String state;
String zip;
String phone;
String pStatus;
ExtPerson temp;
int i = 0;
while (inFile.hasNext())
{
first = inFile.next();
last = inFile.next();
month = inFile.nextInt();
day = inFile.nextInt();
year = inFile.nextInt();
inFile.nextLine();
street = inFile.nextLine();
city = inFile.nextLine();
state = inFile.nextLine();
zip = inFile.nextLine();
phone = inFile.nextLine();
pStatus = inFile.nextLine();
temp = new ExtPerson();
temp.setInfo(first, last, month, day, year,
street, city, state,
zip, phone, pStatus);
adBook.insertAt(temp, i);
i++;
}
}
public static void saveData(AddressBook adBook) throws FileNotFoundException
{
PrintWriter outfile;
String filename;
System.out.println("Enter file name: ");
filename = console.nextLine();
System.out.println();
outfile = new PrintWriter(filename);
adBook.saveData(outfile);
}
public static void showMenu()
{
System.out.println("Welcome to the address book program.");
System.out.println("Choose among the following options:");
System.out.println("1: To see if a person is in the address book");
System.out.println("2: Print the information of a person");
System.out.println("3: Print the names of person having birthday in a particular month");
System.out.println("4: Print the names of persons between two last names");
System.out.println("5: Print the names of persons having a particular status");
System.out.println("6: Print the address book");
System.out.println("7: Save data");
System.out.println("9: Terminate the program");
}
}