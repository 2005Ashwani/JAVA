public class Day6c {
    public static void main(String aa[]) {
        int[] a = { 56, 6, 9, 3, 5, 695 };
        int[] b = { 56, 6, 9, 3, 5, 695, 65, 6526, 8 };
        int[] c = { 56, 6, 9, 3, 5 };
        int[][] x = { a, b, c };
        System.out.println(x.length);
        System.out.println(x[0].length);
        System.out.println(x[1].length);
        System.out.println(x[2].length);
        System.out.println(x[2][2]);

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
