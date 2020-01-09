package Demos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Parent {
	
		public static void main(String[] args) {
		
			Set<String> name= new HashSet<>();
			
			name.add("Rajini");
			name.add("Vijay");
			name.add("Ajith");
			name.add("Rahman");
			name.add(null);
			name.add("Rahman");
			name.add("GV");
			System.out.println(name);
			
			for(String a:name){
				System.out.println(a);
			}
			
			System.out.println("------>");
			ArrayList<String >name1= new ArrayList<>();
			name1.addAll(name);
			System.out.println(name1.get(2));
			
	
		}
}
