package com.operations.crud;

import java.util.HashSet;

public class Hash_set {
	
	static HashSet<HashsetApp> list = new HashSet<HashsetApp>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating Employee data
		HashsetApp emp1 = new HashsetApp(10, "Employee1", "Engineer", "Abc", 20000);
		HashsetApp emp2 = new HashsetApp(11, "Employee2", "Security", "Bbc", 15000);
		HashsetApp emp3 = new HashsetApp(12, "Employee3", "Analyst",  "Cbc", 12000);
		HashsetApp emp4 = new HashsetApp(13, "Employee4", "Engineer", "Abc", 21000);
		
		//Adding to HashSet
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		//Traversing Hashset
		print();
		System.out.println();
		
		//Delete
		list.remove(emp4);
		
		print();
		
	}

	private static void print() {
		// TODO Auto-generated method stub
		for(HashsetApp emp : list)
		{
			System.out.println(emp.employeeId + "\t" + emp.employeeName + "\t" + emp.employeeRole + "\t" + emp.employeeAddress + "\t" + emp.employeesalary);
		}
	}

}
