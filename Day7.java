// NON STATIC MEMBER PROGRAM
class Student {
    int rollno;
    String name;

    void print_details() {
        System.out.println("Rollno: " + rollno);
        System.out.println("Name: " + name);
    }

    void set_details(int r, String n) {
        rollno = r;
        name = n;

    }

}

public class Day7 {

    public static void main(String aa[]) {
        Student s1, s2, s3;
        s1 = new Student(); // CREATING AN OBJECT
        s2 = new Student();
        s3 = new Student();

        // s1.rollno = 45;
        // s2.rollno = 46;
        // s3.rollno = 47;
        // s1.name = "ASHWANI";
        // s2.name = "GOLU";
        // s3.name = "NIKHIL";

        // System.out.println(s1.rollno);
        // System.out.println(s1.name);

        s1.set_details(1, "Prashant");
        s2.set_details(2, "XYZ");
        s3.set_details(3, "ABC");
        s1.print_details();
        s2.print_details();
        s3.print_details();

    }
}
