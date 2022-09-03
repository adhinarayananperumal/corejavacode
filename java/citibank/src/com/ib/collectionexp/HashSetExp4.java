package com.ib.collectionexp;

import java.util.HashSet;
import java.util.Set;

public class HashSetExp4 {
	
	
	public static void main(String... arg) {
		
		Set<String> nameSet=new HashSet();
		
		nameSet.add("Radha");
		nameSet.add("suman");
		nameSet.add("jai");
		nameSet.add("karthi");
		nameSet.add("jai");
		
		System.out.println(nameSet.size());
		
		for (String obj : nameSet) {
			System.out.println(obj); 
		}

	}
	

}
