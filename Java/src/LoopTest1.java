public class LoopTest1 {
    public static void main(String[] args) {
        int i = 2;
        int s = 1;
        do {
            s=s*i;
            i++;
        }
        while(i<=5);
        System.out.println(s);
    }
}
