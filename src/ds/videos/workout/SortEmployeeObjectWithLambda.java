package ds.videos.workout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
	
	int empNo;
	String empName;
	
	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "{empNo=" + empNo + ", empName=" + empName + "}";
	}
	
	
}


public class SortEmployeeObjectWithLambda {

	public static void main(String[] args) {
		
		Employee e = new Employee(1000, "Selva");
		System.out.println(e);
		
		List<Employee> listofEmployee = new ArrayList<>();

		listofEmployee.add(new Employee(10, "Selva"));
		listofEmployee.add(new Employee(3, "Arun"));
		listofEmployee.add(new Employee(11, "Raj"));
		listofEmployee.add(new Employee(15, "Mahi"));
		listofEmployee.add(new Employee(5, "Kavi"));
		
		
		
		System.out.println("Before sorting - "+listofEmployee);
		
		listofEmployee = new ArrayList<>();

		listofEmployee.add(new Employee(10, "Selva"));
		listofEmployee.add(new Employee(3, "Arun"));
		listofEmployee.add(new Employee(11, "Raj"));
		listofEmployee.add(new Employee(15, "Mahi"));
		listofEmployee.add(new Employee(5, "Kavi"));
		
		Collections.sort(listofEmployee,(e1,e2)->(e1.empNo > e2.empNo) ? -1 :(e1.empNo < e2.empNo) ? 1 : 0);
		
		System.out.println("After sorting - "+listofEmployee);
		
		

	}

}
