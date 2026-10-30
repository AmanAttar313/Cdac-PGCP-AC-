package interface_practice.employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e;
		e=new FullTimeSalary();
		
	System.out.println("Full Time Salary : "+e.calculateSalary()); 
	
	e=new PartTimeSalary();
	System.out.println("Part Time Salary : "+e.calculateSalary()); 
	}
}
