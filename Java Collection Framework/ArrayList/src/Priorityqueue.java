import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Priorityqueue {

	public static void main(String[] args) {
		Queue<Integer>p=new PriorityQueue<>(Comparator.reverseOrder());
		p.offer(50);
		p.offer(500);
		p.offer(5000);
		p.offer(5);
		
		System.out.println(p);
		
		p.poll();//small element remove
		System.out.println(p);
		//peek - next element peek 
		System.out.println(p.peek());
		System.out.println(p);

	}

}
