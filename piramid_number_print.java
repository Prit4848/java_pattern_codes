public class piramid_number_print {

    public static void main(String[] args) {


        int n = 5, i, j;


        for (i = 1; i <= n; i++) {
            for (j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
