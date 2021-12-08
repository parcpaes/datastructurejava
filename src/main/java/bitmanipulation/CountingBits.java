package bitmanipulation;

public class CountingBits {
    public static void method1(){
        byte a = 23;
        byte count =0;
        int x = 0;
        for(int i=0;i<8;i++){
            x=1<<i;
            if((x&a)!=0) count++;
        }
        System.out.println(count);
    }
    public static void method2(int x){
        //with 2 mask we count 4 bits.
        int mask1 = 0x5;
        int mask2= 0x3;
        x = (x&mask1)+((x>>1) & mask1);
        x = (x&mask2)+((x>>2)& mask2);
    }
    public static void main(String[] args) {

    }
}
