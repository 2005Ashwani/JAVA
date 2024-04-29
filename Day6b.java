
//PROGRAM FOR MIN 
import java.util.Scanner;

public class Day6b {
    public static void main(String aa[]) {

        int[] x = new int[10];
        Scanner sc = new Scanner(System.in); // CREATING AN OBJECTS
        System.out.println("Enter the 10 values: ");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        int min = x[0];
        for (int item : x) {
            if (min > item) {
                min = item;
            }
        }
        System.out.println("MIN " + min);
    }
}
