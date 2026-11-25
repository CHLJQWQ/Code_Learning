public class MethodTest3 {
    public static void main(String[] args) {
        System.out.println("sum1="+add(1,2));
        System.out.println("sum2="+add(1,2,3));
        System.out.println("sum3="+add(1.2f,2.3f));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static float add(float a,float b){
        return a+b;
    }
}
