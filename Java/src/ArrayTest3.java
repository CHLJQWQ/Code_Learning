public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr={10,11,13,14,15};
        int[] arr2=new int[arr.length+1];
        for(int i=arr.length-1;i>=0;i--){
            if(i>=2){
                arr2[i+1]=arr[i];
            }else{
                arr2[i]=arr[i];
            }
        }
        arr2[2]=12;

        System.out.print("添加新元素之前的arr数组：");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+",");
        }
        System.out.println();
        System.out.print("添加新元素之后的arr2数组：");
        for(int j=0;j<arr2.length;j++){
            System.out.print(arr2[j]+",");
        }
    }
}
