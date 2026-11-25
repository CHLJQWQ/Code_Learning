public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr={9,8,3,5,2};
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        int min ;
        for(int j=arr.length;j>0;j--) {
            boolean check = true;
            for (int i = 1; i < j; i++) {
                if (arr[i] < arr[i - 1]) {
                    min = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = min;
                    check = false;
                }
            }
            if (check) {break;}
        }

        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
