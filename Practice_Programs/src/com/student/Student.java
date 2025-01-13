package com.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

	private int id;
	private String name;
	private int age;
	private List<Address> addressList;
	public Student(int i, String string, int j, List<Address> asList) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	
	
	public static void main(String[] args) {
//		ArrayList<Student> list=new ArrayList<>();
//		list.add(new Student(1,"Ashwin",33,Arrays.asList(new Address(10,"Chandrapur","MH",442907),new Address(11,"Wardha","MH",442100))));
//		list.add(new Student(2,"Rahul",35,Arrays.asList(new Address(10,"Nagpur","MH",440007),new Address(11,"Pune","MH",411057))));
//		list.add(new Student(3,"Gaurav",30,Arrays.asList(new Address(10,"Chandrapur","MH",442907),new Address(11,"Pune","MH",411057))));
//		list.add(new Student(4,"Rakesh",22,Arrays.asList(new Address(10,"Nagpur","MH",440007),new Address(11,"Wardha","MH",442100))));
//		list.add(new Student(5,"Ram",25,Arrays.asList(new Address(10,"Chandrapur","MH",442907),new Address(11,"Nagpur","MH",440007))));
//		
//		//find the list of student whose age>=30 and address is Nagpur
//		
//		List<Address> studentList1 = list.stream().filter(student->student.age>=30).flatMap(stu->stu.addressList.stream())
//										.filter(add->add.getCity().equalsIgnoreCase("Nagpur")).collect(Collectors.toList());
//		System.out.println();
		
		ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Ashwin", 33, Arrays.asList(new Address(10, "Nagpur", "MH", 442907), new Address(11, "Wardha", "MH", 442100))));
        list.add(new Student(2, "Rahul", 35, Arrays.asList(new Address(10, "Nagpur", "MH", 440007), new Address(11, "Pune", "MH", 411057))));
        list.add(new Student(3, "Gaurav", 30, Arrays.asList(new Address(10, "Chandrapur", "MH", 442907), new Address(11, "Pune", "MH", 411057))));
        list.add(new Student(4, "Rakesh", 22, Arrays.asList(new Address(10, "Nagpur", "MH", 440007), new Address(11, "Wardha", "MH", 442100))));
        list.add(new Student(5, "Ram", 25, Arrays.asList(new Address(10, "Chandrapur", "MH", 442907), new Address(11, "Nagpur", "MH", 440007))));

        // Find the list of students whose age >= 30 and address is Nagpur
        List<Student> filteredStudents = list.stream()
            .filter(student -> student.age >= 30 &&
                    student.addressList.stream().anyMatch(address -> address.getCity().equalsIgnoreCase("Nagpur")))
            .collect(Collectors.toList());

        // Print the filtered students
        System.out.println("Students with age >= 30 and address in Nagpur:");
        filteredStudents.forEach(System.out::println);
	}
	
}
