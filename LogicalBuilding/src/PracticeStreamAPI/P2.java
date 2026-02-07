package PracticeStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employees{
	private int id;
	private String name;
	private int age;
	private String dept;
	private int salary;
	
	public Employees(int id,String name,int age,String dept,int salary){
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
public class P2 {
	public static void main(String[] args) {
		
		List<Employees> ls = Arrays.asList(
				new Employees(1, "Hitesh", 25, "IT", 60000),
				 new Employees(2, "Amit", 30, "HR", 45000),
				  new Employees(3, "Rahul", 35, "IT", 90000),
		            new Employees(4, "Neha", 28, "Finance", 70000),
		            new Employees(5, "Priya", 32, "HR", 50000),
		            new Employees(6, "Ankit", 40, "Finance", 120000),
		        	new Employees(7, "Hitesh", 25, "IT", 100000),
					  new Employees(8, "Rahul", 35, "IT", 80000)
				
				);
		//Q1. Find all employees of a specific department
		ls.stream().filter(i -> i.getDepartment().equalsIgnoreCase("it")).forEach(i->System.out.println(i));
		
		//Q2. Find employee with highest salary
		Employees max = ls.stream().max(Comparator.comparing(Employees::getSalary)).get();
		System.out.println(max);
		
		//Q3. Calculate total salary per department
		Map<String, Double> deptsal = ls.stream().collect(Collectors.groupingBy
				(Employees::getDepartment,Collectors.summingDouble(Employees::getSalary)));
		deptsal.forEach((i,j)->System.out.println(i+" "+j));
		
		//Q4. Top 3 highest paid employees from IT department
		ls.stream().filter(i->i.getDepartment().equals("IT")).sorted(Comparator.comparing
				(Employees::getSalary).reversed()).limit(3).forEach(i->System.out.println(i));
		
		//Q5. Sum transaction amounts and sort by date
		
		
		
		
	}
}