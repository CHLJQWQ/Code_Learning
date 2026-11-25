public class BasicTest3 {
    public static void main(String[] args) {
        int i;int j;
        for(i=1;i<=9;i++) {
            for(j=1;j<=i;j++) {
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(i=1;i<=9;i++) {
            for(j=1;j<=i;j++) {
                System.out.printf("%1d*%1d=%2d ",i,j,i*j);
            }
            System.out.println();
        }
    }
}
