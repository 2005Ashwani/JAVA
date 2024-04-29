public class Day7B {
    static int x;
    int y;

    public static void main(String aa[]) {
        // HERE WE HAD USED STATIC IN STATIC
        System.out.println(x);
        // TO ACCSS IT WE CREATE AN OBJECT
        Day7B a = new Day7B();
        System.out.println(a.y);

        int z; // LOCAL VARIABLE
        // BEFORE USE IT WE HAVE TO INITILIZE IT
        z = 20;
        System.out.println(z);

    }
}
