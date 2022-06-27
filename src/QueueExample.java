import java.util.PriorityQueue;
import java.util.Scanner;
public class QueueExample
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        System.out.println("enter the value");
        int value=scanner.nextInt();
        for(int i=0;i<value;i++) {
            queue.add(scanner.nextInt());
        }
        System.out.println("Element of Queue :" + queue);
        for(int i=0;i<=queue.size();i++){
            System.out.println("Removed Element :" + queue.remove());
            System.out.println(queue);
            System.out.println("Head of Queue : " + queue.peek());
        }
       }
}
