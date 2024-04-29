// 

import java.util.*;

public class Day5 {
    public static void main(String aa[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number A: ");
        int a = sc.nextInt();
        System.out.print("Enter the number B: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("sum = " + c);

        // PROGRAM USING THE CONDITIONS
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("ODD");
        }

        // USING THE LOOP
        // TABLE USING CANCONITION
        for (int i = 1; i <= 10; i++) {
            int d = a * i;
            System.out.println(a + " X "+ i + " = " + d);
        }

        // ENTERING THE THREE VALUES WITHOUT USING ANY MESSSAGES
        System.out.println("Enter the three number:");
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();

        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        // CLASS
    }

}
