package com.operations.crud;

import java.util.ArrayList;

public class Array_List {

	static ArrayList<String> list1 = new ArrayList<String>();
	static ArrayList<Integer> list2 = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Create
		//list1
		list1.add("Employee1");
		list1.add("Employee2");
		list1.add("Employee3");
		list1.add("Employee4");
		
		printName();
		
		//list2
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		
		printId();
		
		//Delete
		list1.remove(2);
		list2.remove(2);
		
		printName();
		printId();
		
		//Update
		list1.set(1, "Employee6");
		list2.set(1, 50);
		
		printName();
		printId();
	}

	private static void printId() {
		// TODO Auto-generated method stub
		for(Integer EmployeeId : list2 ) {
			System.out.println(EmployeeId);
		}
		
	}

	private static void printName() {
		// TODO Auto-generated method stub
		for(String Employee : list1 ) {
			System.out.println(Employee);
		}
	}

}
