
// PROGRAM FOR MATERIX
import java.util.Scanner;;

public class Day6d {
    public static void main(String aa[]) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the value: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        System.err.println("The values are as follows:--");
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.err.print(arr[i][j] + " ");

            }
            System.err.println();
        }

    }
}
