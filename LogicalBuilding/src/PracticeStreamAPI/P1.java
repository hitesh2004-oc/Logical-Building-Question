package PracticeStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	private int id;
	private String name;
	private int age;
	private String dept;
	private int salary;
	
	public Employee(int id,String name,int age,String dept,int salary){
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}
	 public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }
	    public String getDepartment() {
	        return dept;
	    }

	    public double getSalary() {
	        return salary;
	    }
	    public String toString() {
	        return id + " " + name + " " + age + " " + dept + " " + salary;
	    }
}
public class P1 {
	public static void main(String[] args) {
		
		List<Employee> ls = Arrays.asList(
				new Employee(1, "Hitesh", 25, "IT", 60000),
				 new Employee(2, "Amit", 30, "HR", 45000),
				  new Employee(3, "Rahul", 35, "IT", 90000),
		            new Employee(4, "Neha", 28, "Finance", 70000),
		            new Employee(5, "Priya", 32, "HR", 50000),
		            new Employee(6, "Ankit", 40, "Finance", 120000)
				
				);
//	ls.stream().filter(i->i.getDepartment().equals("HR")).forEach(i->System.out.println(i));
//	Employee max =
//	ls.stream()
//    .max(Comparator.comparing(Employee::getSalary))
//    .get();
//	System.out.println(max);
//	
//	double avg =ls.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
//    System.out.println(avg);
//    
//    Map<String, Long> deptCount =
//            ls.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//    deptCount.forEach((k, v) -> System.out.println(k + " : " + v));
//    
//    Map<String, Double> davg = ls.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//    davg.forEach((i,j) -> System.out.println(i +":"+j));
    
		
	}
}
