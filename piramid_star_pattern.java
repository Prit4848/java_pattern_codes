public class piramid_star_pattern {
    public static void main(String[] args) {
        int i,j,n=5;

        for(i=1;i<=n;i++){
            for(j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
