package Reg_no_2241007047;

public class Employee {
	String name, jobPosition, contactNumber;
	int empId;
	double salary;
	Date hireDate;
	Address address;
	Employee(String name, int empId, double salary, Date hireDate, String jobPosition, String contactNumber, Address address){
		this.name=name;
		this.empId=empId;
		this.salary=salary;
		this.hireDate=hireDate;
		this.jobPosition=jobPosition;
		this.contactNumber=contactNumber;
		this.address=address;
	}
	void getter() {
		System.out.println("Name: "+name);
		System.out.println("Employee Id: "+empId);
		System.out.println("Salary: "+salary);
		System.out.println("Hire Date: "+hireDate.getter());
		System.out.println("Job Position: "+jobPosition);
		System.out.println("Contact Number: "+contactNumber);
		System.out.print("Address: ");
		address.getter();
	}
	

}
