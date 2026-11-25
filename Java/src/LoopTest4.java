public class LoopTest4 {
    public static void main(String[] args) {
        int[] arr={52,63,1,14,36,95,6,10,27,40};
        int max=arr[0];
        int s=1;
        for(int j=1;j<arr.length;j++){
            if (max<arr[j]){
                max=arr[j];
                s=j+1;
            }
        }
        System.out.println("最大值："+max);
        System.out.println("最大值位于数组中的第"+s+"个位置。");
    }
}
