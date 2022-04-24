/*
class Students		//single class
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
public static void main(String args[])
{
Student obj=new Student();
obj.get("Kumar","20BCE0001","VIT",18);
obj.show();
}
}
*/

//////////////////////////////////////////////////////////////////////

//Array of objects 
import java.util.Scanner;
class Student
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
public static void main(String args[])
{
Student obj=new Student();
obj.get("Kumar","20BCE0001","VIT",18);
obj.show();

//Student obj1=new Student();
obj.get("Naveen","20BCE0002","VIT",18);
obj.show();

Student obj2=new Student();
obj.get("Arun","20BCE0003","VIT",18);
obj.show();

Scanner s=new Scanner(System.in);
int total_student=s.nextInt();
String n,r,u;
int a;



Student array_objects[]=new Student[total_student];
//array_objects[0].show();// exception java.lang.NullPointerException;
/*
array_objects[0]=new Student();
array_objects[0].show();*/



for(int i=0;i<total_student;i++)
{
array_objects[i]=new Student();
n=s.next();
r=s.next();
u="VIT";
a=s.nextInt();
array_objects[i].get(n,r,u,a);
array_objects[i].show();
}
}
}