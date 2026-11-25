public class MethodTest1 {
    public static void main(String[] args) {
        a(3,5);
        a(2,4);
        a(6,10);
    }
    public static void a(int a,int b){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}