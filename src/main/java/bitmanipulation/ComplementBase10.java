package bitmanipulation;

public class ComplementBase10 {

    public static int bitwiseComplement(int num){
        int bitCount =0;
        int all_bit_set =Integer.highestOneBit(num);
//        int n= num;
//        while(n>0){
//            bitCount++;
//            n=n>>1;
//        }
//        int all_bit_set=(int)Math.pow(2,bitCount)-1;
        return num^(all_bit_set|(all_bit_set-1));
    }

    public static void main(String[] args) {
        int x = 0b111;
        System.out.println(Integer.toBinaryString(x));
        int mask =Integer.highestOneBit(x);
//        System.out.println(Integer.toBinaryString(b));
//        while((mask&(mask-1))!=0){
//            mask = (byte) (mask&(mask-1));
//        }
//        mask=~mask;
//        int bitCount = Integer.bitCount(x);
        byte number = (byte) ((mask|(mask-1))^x);
        System.out.println(Integer.toBinaryString(number));
    }
}
