public class ArrayTest5 {
    public static void main(String[] args) {
        int[][] arr={{20,3},{66},{130}};
        int outsum=0;
        for(int j=0;j<arr.length;j++){
            int insum=0;
            for(int k=0;k<arr[j].length;k++){
                insum+=arr[j][k];
            }
            System.out.println("第"+(j+1)+"小组销售额为："+insum+"万元。");
            outsum+=insum;
        }
        System.out.print("总销售额为："+outsum+"万元。");
    }
}
