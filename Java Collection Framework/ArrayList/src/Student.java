import java.util.Objects;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<String> {
	String name;
	int rollno;
	
	public Student(String name, int rollno) {
		this.name=name;
		this.rollno=rollno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollno == other.rollno;
	}

	@Override
	public int compareTo(String o) {
		return 0;
	}

	public List compareTo(Student s2) {
		// TODO Auto-generated method stub
		return null;
	}



	
	
	

}
