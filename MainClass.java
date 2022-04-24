import java.util.Scanner;
import java.lang.*;

class Person {
    String name = new String(), address = new String();
    long phoneNumber = 0L;

    void get_details() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter name:  ");
        name = in.nextLine();

        System.out.print("Enter address:  ");
        address = in.nextLine();

        System.out.println("Enter Phone:  ");
        phoneNumber = in.nextLong();

    }

    void show_details() {
        System.out.println("\nName: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Phone: " + this.phoneNumber + "\n");
    }

}

class Faculty extends Person {
    String faculty_Code = new String(), faculty_Name = super.name, faculty_designation = new String();

    void get_details() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Faculty name:  ");
        name = in.nextLine();

        System.out.print("Enter address:  ");
        address = in.nextLine();

        System.out.println("Enter Phone:  ");
        phoneNumber = in.nextLong();

        System.out.print("Enter Faculty Code: ");
        faculty_Code = in.nextLine();

        System.out.print("faculty_designation:  ");
        faculty_designation = in.nextLine();

    }

    void show_details() {
        System.out.println("\nFaculty's Name: " + this.name);
        System.out.println("Faculty's Address: " + this.address);
        System.out.println("Faculty's Phone: " + this.phoneNumber);
        System.out.println("Faculty's designation: " + this.faculty_designation);
        System.out.println("Faculty's Code:  " + this.faculty_Code);
    }

}

class coursedetails {
    String code = new String();
    String title = new String();
    String slot = new String();
    String faculty_name = new String();

    coursedetails(String code, String title, String slot, String faculty) {
        this.code = code;
        this.title = title;
        this.slot = slot;
        this.faculty_name = faculty;
    }

}

class Student extends Person {
    String student_name = super.name, Reg_no = new String(), student_address = super.address;
    long student_phonenumber = super.phoneNumber;
    String email = new String();

    coursedetails coursearray[] = new coursedetails[5];

    void get_details() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Students name:  ");
        name = in.nextLine();

        System.out.print("Enter Students address:  ");
        address = in.nextLine();

        System.out.println("Enter Students Phone:  ");
        phoneNumber = in.nextLong();

        System.out.print("Enter Students Reg No: ");
        Reg_no = in.nextLine();

        System.out.print("Enter Students email:  ");
        email = in.nextLine();

    }

    void set_coursedetails() {
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
            coursearray[i] = new coursedetails(s1, s2, s3, s4);
        }
    }

    void show_details() {
        System.out.println("\nStudent's Name: " + this.name);
        System.out.println("Student's Address: " + this.address);
        System.out.println("Student's Phone: " + this.phoneNumber);
        System.out.println("Student's Reg No: " + this.Reg_no);
        System.out.println("Student's email:  " + this.email);
        System.out.println("Course enrollment details..");
        for (int i = 0; i < 5; i++) {
            System.out.println("Course " + (i+1));
            System.out.println("Course Code: " + coursearray[i].code);
            System.out.println("Coursename: " + coursearray[i].title);
            System.out.println("Course Slot: " + coursearray[i].slot);
            System.out.println("Course faculty " + coursearray[i].faculty_name);
            System.out.println("\n");

        }

    }

}

/**
 * MainClass
 */
class MainClass {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Faculty facArray[] = new Faculty[5];
        Student studentArray[] = new Student[5];

        for (int i = 0; i < 5; i++) {
            studentArray[i] = new Student();
            studentArray[i].get_details();

        }
        for (int i = 0; i < 5; i++) {
            studentArray[i].show_details();
        }
    }
}