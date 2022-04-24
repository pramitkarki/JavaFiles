import java.util.Scanner;
class Person
{
String name, address,phone_no;

void get_person(String n, String ad,String ph)
{
	name = n;
	address = ad;
	phone_no = ph;
}

void show_person()
{
	System.out.println("Person name is " + name);
	System.out.println("Address "+ address);
	System.out.println("Phone number "+ phone_no);
}

}

class Faculty
{
String faculty_code,faculty_name,faculty_designation;

Faculty(String n) 
{
Scanner Sobj=new Scanner(System.in);

System.out.println("Enter Faculty code ");
faculty_code = Sobj.next();
System.out.println("Enter Faculty name ");
faculty_name = Sobj.next();
System.out.println("Enter Faculty designation ");
faculty_designation = Sobj.next();

}

void get_faculty(String fc, String fn, String fd)
{
	faculty_code = fc;
	faculty_name = fn;
	faculty_designation = fd;
}

void show_faculty()
{
	System.out.println("Faculty code " + faculty_code);
	System.out.println("Faculty name "+ faculty_name);
	System.out.println("Faculty designation "+ faculty_designation);
}

}
class coursedetails {
    String code, title,slot , faculty_name;

    coursedetails(String c, String t, String s, String f) {
        code = c;
        title = t;
        slot = s;
        faculty_name = f;
    }

}

class Student
{
String student_name,reg_no,student_address,email,student_phonenumber;

coursedetails []course=new coursedetails[5];

void get_student(String sn,String rn,String sa,String e,String sph)
{
	student_name = sn;
	reg_no = rn;
	student_address = sa;
	email = e;
	student_phonenumber = sph;
}

void set_course() {
        Scanner in = new Scanner(System.in);
        String s1, s2, s3, s4;
        for (int i = 0; i < 5; i++) {
            System.out.println("For course " + (i + 1));

            System.out.println("Enter course code: ");
            s1 = in.nextLine();
            System.out.println("Enter course title: ");
            s2 = in.nextLine();
            System.out.println("Enter course slot: ");
            s3 = in.nextLine();
            System.out.println("Enter course faculty: ");
            s4 = in.nextLine();
            course[i] = new coursedetails(s1, s2, s3, s4);
        }
}
void show_student()
{
	System.out.println("\nStudent's Name: " + student_name);
        System.out.println("Student's Address: " + student_address);
        System.out.println("Student's Phone: " + student_phonenumber);
        System.out.println("Student's Reg No: " + reg_no);
        System.out.println("Student's email:  " + email);
        System.out.println("Course enrollment details..");
        
	for (int i = 0; i < 5; i++) {
            System.out.println("Course " + (i+1));
            System.out.println("Course Code: " + course[i].code);
            System.out.println("Coursename: " + course[i].title);
            System.out.println("Course Slot: " + course[i].slot);
            System.out.println("Course faculty " + course[i].faculty_name);
}
}

public static void main(String[] args)
{
Scanner s = new Scanner(System.in);

Student studentArray[] = new Student[10];

String sn,rn,sa,e,ph;

for(int i = 0 ; i < 5 ; i++ )
{
System.out.println("Enter Student's name:");
sn = s.nextLine();
System.out.println("Enter Registration Number:");
rn = s.nextLine();
System.out.println("Enter Student's address:");
sa = s.nextLine();
System.out.println("Enter Student's email:");
e = s.nextLine();
System.out.println("Enter Student's phone number:");
ph = s.nextLine();


Student ob = new Student();
ob.get_student(sn,rn,sa,e,ph);

studentArray[i] = new Student();
studentArray[i].get_student(sn,rn,sa,e,ph);

Person obj = new Person();
obj.get_person(sn,sa,ph);
obj.show_person();

}

Faculty obj2=new Faculty("A");
obj2.show_faculty();
          



}
}