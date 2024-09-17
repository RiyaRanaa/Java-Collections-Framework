package queue;
import java.util.Queue;
import java.util.LinkedList;



public class learnLinkedQueue {

	public static void main(String[] args) {
		Queue<Integer>q=new LinkedList<>();
		
		q.offer(12); //add element
		q.offer(120);
		q.offer(1200);
		q.offer(12000);
		System.out.println(q);
		
		System.out.println(q.poll());// remove Fist in first out FIFO
		System.out.println(q);
		System.out.println(q.peek());// returns the head of the queue
	}

}
