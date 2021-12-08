package bitmanipulation;

public class SingleNumber {
    public static void main(String[] args) {
        int array[] = {1,4,2,1,3,2,3};
        int number = 0;
        for(int i=0;i<array.length;i++){
            number = number ^ array[i];
        }
        System.out.println(number);
    }
}
