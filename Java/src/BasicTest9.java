/*
编写一个程序，模拟评分。

歌唱比赛中有 10 名评委，评分规则是：每名评委给出一个 0 ~ 100 之间的分数，然后从 10 名评委所评分数中，去掉一个最高分，再去掉一个最低分，对剩余分数取平均值作为选手的最终得分。

要求最终得分数据类型为整数。
*/
import java.util.Random;
public class BasicTest9 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr=new int[10];
        int min = 101;
        int max = -1;
        int avg;
        int sum = 0;
        boolean minonly = true;
        boolean maxonly = true;
        for(int i=0;i<arr.length;i++){
            arr[i]= ran.nextInt(101);
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            //System.out.print(arr[i]+" ");
            if (arr[i]==min && minonly){
                minonly=false;
                continue;
            }
            if (arr[i]==max && maxonly){
                maxonly=false;
                continue;
            }
            sum += arr[i];
        }
        avg = Math.round((float)sum/(float)(arr.length-2));
        System.out.print(avg);
    }
}
