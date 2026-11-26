import java.util.Scanner;
public class BasicTest8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        switch (num){
            case 1:{
                int r=sc.nextInt();
                int s =area(r);
                System.out.println(s);
                break;
            }
            case 2:{
                float r=sc.nextFloat();
                float s=area(r);
                System.out.println(s);
                break;
            }
            default:{
                System.out.println("无效的操作编号");
            }
        }
    }

    //计算圆形面积
    public static float area(float r){
        return (3.1415f*r*r);
    }

    //计算正方形面积
    public static int area(int r){
        return (r*r);
    }
}
