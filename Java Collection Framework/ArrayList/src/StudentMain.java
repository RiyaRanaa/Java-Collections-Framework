import java.util.HashSet;
import java.util.Set;
public class StudentMain {

	public static void main(String[] args) {
		Set<Student>s=new HashSet<>();
		s.add(new Student("Riya",1));
		s.add(new Student("Riy",2));
		s.add(new Student("Ri",3));
		
		s.add(new Student("Riya",1));
		
		System.out.println(s);
		
		Student s1=new Student("Riya", 1);
		Student s2=new Student("Rana", 1);
		System.out.println(s1.equals(s2));
		

	}

}
