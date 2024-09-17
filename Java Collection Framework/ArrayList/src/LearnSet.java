// iske andar dublicate element allow nhi hota h, order wise n hota h 
import java.util.HashSet;
import java.util.Set;

// set property with linked list property like orderwise element dalte h
import java.util.LinkedHashSet;

//sorted form, Binary search, set all property same 
import java.util.TreeSet;
public class LearnSet {

	public static void main(String[] args) {
//		Set<Integer>s=new HashSet<>(); //O(1)
//		Set<Integer>s=new LinkedHashSet<>();
		Set<Integer>s=new TreeSet<>();//O(lon n) becoz binary search tree 
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		
		s.add(1);// set k andar dublicate add nhi hota
		
		System.out.println(s);
		
		//remove
		s.remove(5);
		System.out.println(s);
		
		//check if element present or not, its return True, False
		System.out.println(s.contains(20));
		
		System.out.println(s.isEmpty());// return true, false
		
		s.clear();//all element remove
		System.out.println(s);

	}

}
