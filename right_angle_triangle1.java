public class right_angle_triangle1 {
    public static void main(String[] args) {
        int n=5,j,i,num=2;

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){

                    System.out.print(num+"\t");
                num=num+2;
            }
            System.out.println();
        }
    }
}
