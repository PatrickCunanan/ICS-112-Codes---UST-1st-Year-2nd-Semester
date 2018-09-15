import java.io.*;
public class AddressBook
{
private ExtPerson[] list;
private int length;
public AddressBook()
{
list = new ExtPerson[500];
for(int i = 0; i < 500; i++)
list[i] = null;
length = 0;
}
public void print()
{
for(int i = 0; i < length; i++)
list[i].printInfo();
}
public void printNameInTheMonth(int month)
{
for(int i = 0; i < length; i++)
{
if(list[i].isMonth(month))
System.out.println(list[i].getFirstName() + " " +
list[i].getLastName());
}
}
public void printInfoOf(String lName)
{
int i = search(lName);
if (i != -1)
list[i].printInfo();
else
System.out.println(lName + " is not in address book.");
}
public void printNamesWithStatus(String status)
{
for (int i = 0; i < length; i++)
if (list[i].isStatus(status))
System.out.println(list[i].getFirstName() + " "
+ list[i].getLastName());
}
public void printAt(int i)
{
if (i < length)
list[i].printInfo();
else
System.out.println("No such person");
}
public void printNamesBetweenLastNames(String last1, String last2)
{
String lName;
for (int i = 0; i < length; i++)
{
lName = list[i].getLastName();
if (last1.compareTo(lName) <= 0 && lName.compareTo(last2) <= 0)
System.out.println(list[i].getFirstName() + " "
+ list[i].getLastName());
}
}
public void insertAt(ExtPerson eP, int i)
{
list[i] = null;
list[i] = eP;
if (i == length)
length++;
}
public void insertLast(ExtPerson eP)
{
list[length] = eP;
length++;
}
public int search(String lName)
{
boolean found = false;
int i;
for (i = 0; i < length; i++)
if (list[i].isLastName(lName))
{
found = true;
break;
}
if (found)
return i;
else
return -1;
}
public void sort()
{
String str1;
String str2;
int i, j;
ExtPerson temp = new ExtPerson();
int minIndex;
for (i = 0; i < length - 1; i++)
{
minIndex = i;
str1 = list[minIndex].getLastName();
for (j = i + 1; j < length; j++)
{
str2 = list[j].getLastName();
str1 = list[minIndex].getLastName();
if (str1.compareTo(str2) > 0)
minIndex = j;
}
temp.copyExtPerson(list[minIndex]);
list[minIndex].copyExtPerson(list[i]);
list[i].copyExtPerson(temp);
}
}
public void saveData(PrintWriter outFile)
{
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
for (int i = 0; i < length; i++)
{
first = list[i].getFirstName();
last = list[i].getLastName();
month = list[i].getMonth();
day = list[i].getDay();
year = list[i].getYear();
street = list[i].getStreetAddress();
city = list[i].getCity();
state = list[i].getState();
zip = list[i].getZip();
phone = list[i].getPhoneNumber();
pStatus = list[i].getStatus();
outFile.println(first + " " + last);
outFile.println(month + " " + day + " " + year);
outFile.println(street + " \n" + city + " \n" + state + " \n" + zip);
outFile.println(phone + " \n" + pStatus);
}
}
}