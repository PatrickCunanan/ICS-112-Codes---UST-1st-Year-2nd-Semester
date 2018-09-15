public class ExtPerson extends Person
{
private Address address;
private Date dob;
private String phoneNumber;
private String personStatus;
public ExtPerson()
{
super("", "");
address = new Address("", "", "", "");
dob = new Date(1, 1, 1900);
phoneNumber = "";
personStatus = "";
}
public ExtPerson(String fName, String lName, int month, int day, int year,
String street, String c, String s, String z,
String phone, String pStatus)
{
super(fName, lName);
address = new Address(street, c, s, z);
dob = new Date(month, day, year);
phoneNumber = phone;
personStatus = pStatus;
}
public void printAddress()
{
System.out.println(super.toString());
System.out.println();
System.out.println(address);
}
public void printInfo()
{
System.out.println(super.toString());
System.out.println("Date of Birth: " + dob);
System.out.println("Phone Number: " + phoneNumber);
System.out.println("Person Type: " + personStatus);
System.out.println(address);
}
public void setInfo(String fName, String lName,
int month, int day, int year,
String street, String c, String s,
String z, String phone, String pStatus)
{
super.setName(fName,lName);
dob.setDate(month, day, year);
address.setAddress(street,c,s,z);
phoneNumber = phone;
personStatus = pStatus;
}
public void copyExtPerson(ExtPerson otherExtP)
{
address.copyAddress(otherExtP.address);
dob.setDate(otherExtP.dob.getMonth(),
otherExtP.dob.getDay(),
otherExtP.dob.getYear());
phoneNumber = otherExtP.phoneNumber;
personStatus = otherExtP.personStatus;
}
public boolean isLastName(String lName)
{
return(super.getLastName().equals(lName));
}
public String getStatus()
{
return personStatus;
}
public String getPhoneNumber()
{
return phoneNumber;
}
public boolean isStatus(String status)
{
return (status.equals(personStatus));
}
public boolean isDOB(int month, int day, int year)
{
return(dob.getMonth() == month
&& dob.getDay() == day
&& dob.getYear() == year);
}
public boolean isMonth(int month)
{
return(dob.getMonth() == month);
}
public int getMonth()
{
return dob.getMonth();
}
public int getDay()
{
return dob.getDay();
}
public int getYear()
{
return dob.getYear();
}
public String getStreetAddress()
{
return address.getStreetAddress();
}
public String getCity()
{
return address.getCity();
}
public String getState()
{
return address.getState();
}
public String getZip()
{
return address.getZip();
}
}