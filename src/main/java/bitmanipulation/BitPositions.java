package bitmanipulation;

public class BitPositions {
    public static int getBitNth(int x,int i){
        return (x&(1<<i))!=0 ? 1 : -1;
    }
    public static int removeNthBit(int x,int i){
        return (x&(~(1<<i)));
    }
    public static void main(String[] args) {
        System.out.println(getBitNth(12,3));
        System.out.println(removeNthBit(12,3));
    }
}
