public class BasicTest4 {
    public static void main(String[] args) {
        int[] a={5,10,-8,-2,-500,50,200};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }else if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("max="+max);
        System.out.print("min="+min);
    }
}
