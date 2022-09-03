package com.ib.collectionexp;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExp {

	public static void main(String[] args) {

		Set<String> treeSet = new TreeSet();

		treeSet.add("zat");
		treeSet.add("suman");
		treeSet.add("jai");
		treeSet.add("karthi");
		treeSet.add("jai");

		System.out.println(treeSet.size());

		for (String obj : treeSet) {
			System.out.println(obj);
		}

	}

}
