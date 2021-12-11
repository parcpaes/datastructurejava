package stack.challenge;

import stack.Queue;

public class BinaryNumber {
    public String[] finBin(int number){
        Queue<String> queue = new Queue<>(number+1);
        String binary[] = new String[number];
        queue.enqueue("1");
        for(int i=0;i<number;i++){
            binary[i]= queue.dequeue();
            String s1 = binary[i]+"0";
            String s2 = binary[i]+"1";
            queue.enqueue(s1);
            queue.enqueue(s2);
        }
        return binary;
    }
}
