import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<String, Integer>n=new HashMap<>();
		
		
		Map<String, Integer>n=new TreeMap<>();
		// remove - key par kaam aata h
		
		n.put("one", 1);
		n.put("two", 2);
		n.put("three", 3);
		
//		n.put("one", 11);//update 2 
		
//		if(!n.containsKey("two")) {
//			n.put("two", 22);
//		}
		
		System.out.println(n.containsValue(3));
		System.out.println(n.isEmpty());
		// clear
		
		
		n.putIfAbsent("two", 24);

		System.out.println(n);
		
		for(Map.Entry<String, Integer>e: n.entrySet()) {
			System.out.println(e);
			
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		System.out.println(n);
		for(String key:n.keySet()) {
			System.out.println(key);
		}
		for(Integer value:n.values()) {
			System.out.println(value);
		}

	}

}
