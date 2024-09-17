import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class LearnCollectionClass {

	public static void main(String[] args) {
//		List<Integer>l=new ArrayList<>();
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		l.add(10);
//		l.add(9);
//		l.add(8);
//		l.add(7);
//		l.add(7);
//		l.add(7);
//		
//		System.out.println("Min element: "+Collections.min(l));
//		System.out.println("Max element: "+Collections.max(l));
//		System.out.println("count element 7: "+Collections.frequency(l,7));
//		
//		Collections.sort(l, Comparator.reverseOrder());
//		System.out.println(l);
//		
		
		List<Student>s=new ArrayList<>();
		s.add(new Student("Riya",1));
		s.add(new Student("Riy",2));
		s.add(new Student("Ri",3));
		
		Student s1=new Student("Riya", 1);
		Student s2=new Student("Rana", 1);
		Collections.sort(s1.compareTo(s2));
		System.out.println(s);
		
	}

}
