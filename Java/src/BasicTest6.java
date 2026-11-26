import java.util.Scanner;
public class BasicTest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if (a>=3 && a<=5){
            System.out.print("春季");
        }else if (a>=6 && a<=8){
            System.out.print("夏季");
        }else if (a>=9 && a<=11){
            System.out.print("秋季");
        }else if (a==12 || a<=2 && a>=1){
            System.out.print("冬季");
        }else{
            System.out.print("输入错误");
        }
    }
}
