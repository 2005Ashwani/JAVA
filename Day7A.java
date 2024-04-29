public class Day7A {

    public static void main(String aa[]) {
        // student.name = "A"; // STUDENT ALWAYS USE IN STATIC IN THIS CASE
        student.collage = "ABC";
        student.f2();
        // student.f1(); //STUDENT ALWAYS USE IN STATIC IN THIS CASE

        student s_1, s_2, s_3;
        s_1 = new student();
        s_2 = new student();
        s_3 = new student();
        s_1.name = "ASHWANI";
        s_2.name = "GOLU";
        s_3.name = "NIKHIL";
        s_1.rollno = 1;
        s_2.rollno = 2;
        s_3.rollno = 3;

        // calling the function
        s_1.f1();
        s_2.f1();
        s_3.f1();
        System.out.println();
        System.out.println();
        s_1.name = "Rahul";
        s_1.collage = "XYZ";
        s_1.f1();
        s_2.f1();
        s_3.f1();
    }

}

/**
 * Student
 */
class student {

    String name;
    int rollno;
    static String collage;

    void f1() {
        System.out.println(collage);
        System.out.println(name);
        System.out.println(rollno);
        System.out.println();
    }

    static void f2() {
        System.out.println("Collage is " + collage);
        // System.out.println(name); // IT PROVIDE AN ERROR BECAUSE IT IS NOT STATIC
    }
}
