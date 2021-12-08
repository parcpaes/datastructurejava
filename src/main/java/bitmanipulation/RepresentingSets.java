package bitmanipulation;

public class RepresentingSets {
    public static int representingSet(){
        int array[] = {1,3,4,8};
        int x =0;
        x|=(1<<1);
        x|=(1<<3);
        x|=(1<<4);
        x|=(1<<8);
        int y = 0;
        for(int i=0;i<array.length;i++){
            y|=1<<array[i];
        }
        System.out.println("iterating "+Integer.toBinaryString(y));
        System.out.println(Integer.bitCount(x));
        System.out.println(Integer.toBinaryString(x));
        return x;
    }
    public static void printElements(int x){
        for(int i=0;i<32;i++){
            if((x&(1<<i))!=0) System.out.printf(" %d",i);
        }
    }
    public static void main(String[] args) {
        int x = representingSet();
        printElements(x);
        int n = 3;
        System.out.println("--------");
        System.out.println("--------");
        String array[] = {"A","B","C"};
        for(int subset=1; subset<(1<<n);subset++){
            for(int i=0;i<n;i++){
                if((subset&(1<<i))!=0){
                    System.out.printf(" %s",array[i]);
                }
            }
            System.out.println();
        }
    }
}
