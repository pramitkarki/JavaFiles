/*
class class Student1		//multiple class
{
String name,reg_no,address; //instance variable
int age;
void get(String n,String r,String a,int ag)
{
name=n;
reg_no=r;
address=a;
age=ag;
}
void show()
{
System.out.println("Student name "+ name);
System.out.println("Student Reg_no "+ reg_no);
System.out.println("Student Address "+ address);
System.out.println("Student Age "+ age);
}
}
class test_student1
{
public static void main(String args[])
{
Student1 obj=new Student1();
obj.get("Kumar","20BCE0001","VIT",18);
obj.show();
Student1 obj1=new Student1();
obj1.get("Babu","20BCE0002","VIT",18);
obj1.show();
Student1 obj2=new Student1();
obj2.get("Arun","20BCE0003","VIT",18);
obj2.show();
}
}
*/

/////////////////////////////////////////////////////////////////////////////////

//Class with constructors 
import java.util.Scanner;
class Student1
{
String name,reg_no,address; //instance variable
int age;
Student1() //no argument constructor
{
}
Student1(String n) //one argument constructor
{
System.out.println("This is the constructor used to get user inputs" + n);
Scanner Sobj=new Scanner(System.in);
String str1=Sobj.next();
String str2=Sobj.next();
String str3=Sobj.next();
int a=Sobj.nextInt();
name=str1;
reg_no=str2;
address=str3;
age=a;
}
Student1(String n,String r) //two argument constructor
{
name=n;
reg_no=r;
}
Student1(String n,String r,String a,int ag)
{
name=n;
reg_no=r;
address=a;
age=ag;
}



void get(String n,String r,String a,int ag)
{
name=n;
reg_no=r;
address=a;
age=ag;
}
void get1(String a,int ag)
{
address=a;
age=ag;
}
void show()
{
System.out.println("Student name "+ name);
System.out.println("Student Reg_no "+ reg_no);
System.out.println("Student Address "+ address);
System.out.println("Student Age "+ age);
}
}
class test_student1
{
public static void main(String args[])
{
Student1 obj=new Student1();
obj.get("Kumar","20BCE0001","VIT",18);
obj.show();
Student1 obj1=new Student1();
obj1.get("Babu","20BCE0002","VIT",18);
obj1.show();
Student1 obj2=new Student1();
obj2.get("Arun","20BCE0003","VIT",18);
obj2.show();
Student1 obj4=new Student1("Arun kumar","20BCE0004","VIT",18);
obj4.show();
Student1 obj5=new Student1("Ram","20BCE0004");
obj5.get1("VIT",19);
obj5.show();
Scanner Sobj=new Scanner(System.in);
String str1=Sobj.next();
String str2=Sobj.next();
String str3=Sobj.next();
int a=Sobj.nextInt();
Student1 obj6=new Student1(str1,str2,str3,a);
obj6.show();
Student1 obj7=new Student1("User input inside constructor");
obj7.show();
}
}