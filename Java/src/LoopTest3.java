import java.util.Scanner;
public class LoopTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true){
            if (sc.hasNextInt()){
                n = sc.nextInt();
            }else{
                System.out.println("输入数据类型错误，请重新输入");
                sc.next();
                continue;
            }
            if (n>=100 && n<=999){
                break;
            }else{
                System.out.println("输入位数错误，请重新输入");
            }
        }
        int a = n/100;
        int b = n/10%10;
        int c = n%10;
        if (a*a*a+b*b*b+c*c*c==n){
            System.out.println(n+"是水仙花数。");
        }else{
            System.out.println(n+"不是水仙花数。");
        }
    }
}
