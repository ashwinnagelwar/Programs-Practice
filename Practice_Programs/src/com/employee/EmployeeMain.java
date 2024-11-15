package com.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "Ashwin", 32, 7200, "Male", "IT", "Nagpur", 2021));
		list.add(new Employee(1, "Ashwini", 30, 7580, "Female", "Computer", "Pune", 2022));
		list.add(new Employee(1, "Ranjit", 34, 10200, "Male", "IT", "Pune", 2020));
		list.add(new Employee(1, "Sagar", 26, 8800, "Male", "Agree", "Warora", 2024));
		list.add(new Employee(1, "Vaibhav", 31, 5600, "Male", "RealEstate", "Nagpur", 2017));
		list.add(new Employee(1, "Vinay", 33, 8200, "Male", "IT", "Nagpur", 2021));
		list.add(new Employee(1, "Rohini", 30, 7200, "Female", "IT", "Warora", 2023));
		list.add(new Employee(1, "Salomi", 28, 9500, "Female", "Medical", "Nagpur", 2022));
		list.add(new Employee(1, "Milind", 32, 7900, "Male", "Social", "Gadchiroli", 2023));
		list.add(new Employee(1, "Darshan", 32, 9200, "Male", "Computer", "Nagpur", 2021));
		
		//1. Grouping Employees by city
		Map<String, List<Employee>> emp1 = list.stream().collect(Collectors.groupingBy(Employee::getCity));
		System.out.println("Grouping employee by city: "+emp1);

		//2. Grouping Employees by age
		Map<Integer, List<Employee>> emp2 = list.stream().collect(Collectors.groupingBy(Employee::getAge));
		System.out.println("Grouping employee by age: "+emp2);
		
		//3. finding the count of female and male employee
		Map<String, Long> emp3 = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println("Count of Female and Male employee: "+emp3);
		
		//4. printing names of all departments
		list.stream().map(e->e.getDeptName()).forEach(System.out::println);
		
		//5. print employee name whose age is greater than 28
		list.stream().filter(emp->emp.getAge()>28).forEach(System.out::println);
		
		//6. finding maximum age of employee
		Employee employee = list.stream().max(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println("Highest age of employee is: "+employee.getAge());
		
		//7. print average age of male and female employee
		Map<String, Double> emp4 = list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("Average age of male and female employee is "+emp4);
		
		//8. Printing number of employee in each department
		Map<String, Long> emp5 = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
		System.out.println("Number of employee in each department: "+emp5);
		
		//9. find the oldest employee
		Employee employee2 = list.stream().max(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println("Oldest employee is "+employee2);
		
		//10. find youngest female employee
		Employee employee3 = list.stream().filter(emp->emp.getGender().equalsIgnoreCase("Female")).min(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println("Youngest Female employee is: "+employee3);
		
		//11. Find employees whose age is greater than 30 and less than 30
		Set<Entry<Boolean,List<Employee>>> entrySet = list.stream().collect(Collectors.partitioningBy(emp->emp.getAge()>30)).entrySet();
		for(Map.Entry<Boolean, List<Employee>> entry:entrySet)
		{
			if(Boolean.TRUE.equals(entry.getKey()))
			{
				System.out.println("Employees greater than 30 "+entry.getValue());
			}else
			{
				System.out.println("Employee less than 30 "+entry.getValue());
			}
		}
		
		//12. find department with highest number of employee
		Entry<String, Long> entry = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println("Department with highest number of employees "+entry);
		
		//13. find employee from Medical Department
		List<Employee> emp6 = list.stream().filter(emp->emp.getDeptName().equalsIgnoreCase("medical")).collect(Collectors.toList());
		System.out.println("Employees from Medical Department "+emp6);
		
		//14. find Departments which has count more than 1
		List<Entry<String, Long>> emp7 = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting())).entrySet().stream().filter(emp->emp.getValue()>1).collect(Collectors.toList());
		System.out.println("Department with employee count more than 1 "+emp7);
		
		//15. find distinct department name
		list.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);
		
		//16.find by city and sort employees by name
		List<Employee> emp8 = list.stream().filter(emp->emp.getCity().equalsIgnoreCase("Pune")).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		System.out.println("Employee Who lives in Pune and sorted by their name "+emp8);
		
		//17. count the number of employees in organization
		long count = list.stream().count();
		System.out.println("Total employees in organization: "+count);
		
		//18. Sort employee by age
		List<Employee> emp9 = list.stream().sorted(Comparator.comparing(Employee::getAge,Comparator.reverseOrder())).collect(Collectors.toList());
		System.out.println("Sorted Employee by age: "+emp9);
		
		//19. Print the average and total salary of the organization
		DoubleSummaryStatistics emp10 = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average salary of employee: "+emp10.getAverage());
		System.out.println("Total salary of employee: "+emp10.getSum());
		
		//20. Printing average salary of each department
		Map<String, Double> emp11 = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.averagingLong(Employee::getSalary)));
		System.out.println("Average salary of each department: "+emp11);
		
		//21. finding highest salary in the organization
		Employee employee4 = list.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println("Highest salary in organization: "+employee4);
		
		//22. finding second highest salary in the department
		Employee employee5 = list.stream().sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder())).skip(1).findFirst().get();
		System.out.println("Second highest salary: "+employee5);
		
		//23.find the highest salary based on gender
		Map<String,Optional<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		System.out.println("Highest salary based on gender: "+map);
		
		//24. sort salary in ascending order
		List<Employee> emp12 = list.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		System.out.println("Salary sorted in ascending order: "+emp12);
		
		//25. sort salary in descending order
		List<Employee> emp13 = list.stream().sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder())).collect(Collectors.toList());
		System.out.println("Salary sorted in ascending order: "+emp13);
				
		//26. finding the highest salary from each department
		Map<String,Optional<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		System.out.println("Department wise highest salary "+collect);
				
	}
}
