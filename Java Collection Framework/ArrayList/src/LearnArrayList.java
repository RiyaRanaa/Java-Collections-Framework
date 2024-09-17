
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

import java.util.Stack;
public class LearnArrayList {

	public static void main(String[] args) {
		ArrayList<String> studentname=new ArrayList<>();// create empty array list
		studentname.add("Riya");
		// size=n
		// size=n+n/2+1
		
		List<Integer> list=new ArrayList();
		list.add(100);
		list.add(298);
		list.add(300);
		System.out.println(list);
		list.add(400);// this will add 4 at the end of the list
		System.out.println(list);
		list.add(1,50);//this will add 50 at 1th index
		System.out.println(list);
		
		List<Integer> newList=new ArrayList();
		newList.add(111);
		newList.add(999);
		System.out.println(newList);
		
		list.addAll(newList);//this will add all the element of newList with list 
		System.out.println(list);
		
		System.out.println(list.get(1));//get element
		list.remove(1);//remove index
		System.out.println(list);
		list.remove(Integer.valueOf(400));//remove element
		System.out.println(list);
		
		 //O(n)
		
		list.set(0, 10000);// update element
		System.out.println(list); // O(1)
		
		//check present or not element, return true false
		// O(n)
		System.out.println(list.contains(700));
		
		// is list k andar kitne element h is time p (list iterate
		for(int i=0;i<list.size();i++) {
			System.out.println("Element is using for loop: "+list.get(i) );
		}
		
		for(Integer element: list) {
			System.out.println("Element using foreach: "+element);
		}
		
		Iterator<Integer> it=list.iterator();
		// kya fihlal is iterator k andar koi next element h ?
		while(it.hasNext()) {
			System.out.println(("Iterator: "+it.next()));
		}
		
		
		// STACK
		Stack<String> animal=new Stack<>();
		
		animal.push("Lion1");
		animal.push("Lion2");
		animal.push("Lion3");
		animal.push("Lion4");
		System.out.println(animal);
		// peek top element ko batayega
		System.out.println(animal.peek());
		
		animal.pop();// top element delete
		System.out.println(animal);
		System.out.println(animal.peek());
		
		List<Integer>l=new LinkedList<>();
	}

}
