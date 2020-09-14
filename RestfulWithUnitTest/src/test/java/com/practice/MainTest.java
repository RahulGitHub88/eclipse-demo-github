package com.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employeeList  = new ArrayList<>();
		employeeList.add(new Employee("John", "FINANCE",1000));
		employeeList.add(new Employee("Tim", "ADMIN",5000));
		employeeList.add(new Employee("Ryan", "ADMIN",2000));
		employeeList.add(new Employee("Tom", "FINANCE",10000));
		
		// Top paid salary employee
		Map<String,Employee>  topPaidEmployees = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDepartment(),
				Collectors.collectingAndThen(Collectors.maxBy
						(Comparator.comparingDouble(e -> e.getSalary())), Optional :: get)));
		
		Map<String,Long> eachDeptCount = employeeList.stream().collect(Collectors.groupingBy(e -> e.getDepartment(),Collectors.counting()));
		
		Map<String,List<Employee>> groupByDept =    employeeList.stream().collect(Collectors.groupingBy(e -> e.getDepartment()));
		
		topPaidEmployees.forEach((k,v) -> System.out.println(k + ": " +  v.getName()));
		eachDeptCount.forEach((k,v) -> System.out.println(k + ": " +  v));
		groupByDept.forEach((k,v) -> System.out.println(k + ": " +  v));
		
		
		
		System.out.println(topPaidEmployees);
		System.out.println(eachDeptCount);
		System.out.println(groupByDept);

	}

}
