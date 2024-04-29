class Day4 {

  public static void main(String aa[]) {
    System.out.print("Hello World");
    // println => used to print the linnes in the
    System.out.print("Hello World\n");
    System.out.println(154);
    System.out.println(54.5);
    System.out.println('a');
    System.out.println(152 * 15 + 69);
    double b = 236.56;
    int a = 10;
    System.out.println(a);
    System.out.println(b);

    // we can use Cancotanition process to add two string
    int c = 56;
    double d = 123.6;
    System.out.println("ABC" + "XYZ");
    System.out.println("ABC" + 123);
    System.out.println(123 + 10 + "XYZ");
    System.out.println("XYZ" + 12 + 12);
    System.out.println("The value of C is " + c); // + is used always
    System.out.println("The value of D is " + d);
    System.out.println("A = " + a);

    // DATA TYPE
    float x = 36.369f;
    System.out.println(x);
    double y = 36.369;
    System.out.println(y);

    y = x;
    System.out.println(y);
    // x=y BADA CHOTA MA ASSIGN NHI KAR SAKTA HA
    x = (float) y;
    System.out.println(x);

    // Byte conversion
    int e = 100;
    int f = 120;
    byte z, v;
    z = (byte) e;
    v = (byte) f;
    System.out.println(v);
    System.out.println(z);

    // LONG DATA TYPE
    long l = 456L; // IF l=3000000000000000000000000000 THAN IT WILL GIVE AN ERROR THAT IT IS TOO
                   // LONG
    System.out.println(l);

    // mathmetical operations
    int g = 45;
    int h = 55;
    double i = 55;
    float j = 55;

    System.out.println(g + h);
    System.out.println(g - h);
    System.out.println(g * h);
    System.out.println(g / h);
    System.out.println(g % h);
    System.out.println(g + i);
    System.out.println(j + j);

  }
}
