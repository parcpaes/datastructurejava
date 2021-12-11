package bitmanipulation;

public class GrayCode {
    public static void main(String[] args) {
        int n =8;
        for(int i=0;i<n;i++){
            int g = i ^ (i>>1);
            System.out.println(Integer.toBinaryString(g));
        }
    }
}
