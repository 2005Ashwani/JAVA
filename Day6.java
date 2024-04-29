import java.util.Scanner;
public class Day6 {
    public static void main(String a[])
    {
        int[] x;
        x=new int[10];

        //YOU CAN WRITE IT ON THE SINGLE LINE
        int[] y=new int[17];

        //ASSIGN THE VALUES
        int[] z= new int[]{123,5965,5965,66,66};                                                                                                                                                                                
        int[] w={123,456,778,889,99};
        System.out.println(x.length);
        System.out.println(y.length);
        System.out.println(z.length);
        System.out.println(w.length);

        //TAKING THE INPUT FROM USER
        Scanner sc = new Scanner(System.in);            // CREATING AN OBJECTS
        System.out.print("Enter the 10 Values: ");
        for(int i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");


        }

        // ANATHER WAY OF THE LOOP IMPLETATION 
        for(int item:x)
        {
            System.out.print(item +" ");
        }
    }
}
