import java.util.ArrayDeque;
public class ArrayDequeLearn {

	public static void main(String[] args) {
		ArrayDeque<Integer>a=new ArrayDeque<>();
		a.offer(20);
		a.offerFirst(200);// head m element add karta h(starting positian m add)
		a.offerLast(50);
		System.out.println(a);
		
		System.out.println(a.peek()); 
		System.out.println(a.peekFirst());
		System.out.println(a.peekLast());

		System.out.println(a.poll());
		System.out.println("poll()"+a);
		
		System.out.println(a.pollFirst());
		System.out.println("pollFirst() " +a);
		
		System.out.println(a.pollLast());
		System.out.println("pollLast() " +a);

	}

}
