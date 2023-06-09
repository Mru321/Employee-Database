package Reg_no_2241007047;
import java.util.Scanner;

public class Test {
	public static void arrangeEmployeeBySalary(Employee e[]) {
		for(int i=0; i<e.length;i++) {
			int maxpos=i;
			for(int j=i+1; j<e.length; j++) {
				if(e[maxpos].salary<e[j].salary) {
					maxpos=j;
						}
				
			}
				Employee temp= e[maxpos];
				e[maxpos]=e[i];
				e[i]=temp;
			
		}
	}
	public static void getEmployeeByJobPosition(Employee e[], String jp) {
		System.out.println("Employees with job position as "+jp+" are: ");
		for(int i=0; i<e.length; i++) {
				if(jp.equals(e[i].jobPosition)) {
					e[i].getter();
				}
			
		}
	}
	public static void getEmployeeByHireDate(Employee e[], Date d1, Date d2) {
		System.out.println("The employees hired between the given interval are: ");
		int date1= ((d1.y)*10000)+((d1.m)*100)+(d1.d);
		int date2 =((d2.y)*10000)+((d2.m)*100)+(d2.d);
		for(int i=0; i<e.length; i++) {
				int date=((e[i].hireDate.y)*10000)+((e[i].hireDate.m)*100)+(e[i].hireDate.d);
				if(date<date2 && date>date1) {
					e[i].getter();
				}
			
		}
		
	}
	public static int foreignEmployeeCount(Employee e[]) {
		System.out.println("The number of foreign employees are: ");
		int count=0;
		for(int i=0; i<e.length; i++) {
				if((e[i].contactNumber.charAt(0))+e[i].contactNumber.charAt(1)!=106) {
					count++;
				}
			
		}
		return count;
	}
	public static void getEmployeeBySalary(Employee e[], double s1, double s2) {
		System.out.println("The employees with salary in the given range are: ");
		for(int i=0; i<e.length; i++) {
				if(e[i].salary<=s2 && e[i].salary>=s1) {
					e[i].getter();
				}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number of employees: ");
		int num=sc.nextInt();
		sc.nextLine();
		Employee emp[]= new Employee[num];
		boolean b=true;
		for(int i=0; i<emp.length; i++) {
				System.out.println("Enter name, empId, salary: ");
				
				String n= sc.nextLine();
				int eId= sc.nextInt();
				double s= sc.nextDouble();
				System.out.println("Enter the date(ddmmyyy): ");
				int dt= sc.nextInt();
				int month= sc.nextInt();
				int year=sc.nextInt();
				Date hD= new Date(dt, month, year);
				System.out.println("Enter jobPosition, contactNumber: ");
				sc.nextLine();
				String jp= sc.nextLine();			
				String ph= sc.nextLine();
				System.out.println("Enter the House number, area, city, state, pincode: ");
				
				int houseno=sc.nextInt();
				sc.nextLine();
				String areaname=sc.nextLine();
				String city=sc.nextLine();
				String state =sc.nextLine();
				String pincode=sc.nextLine();
				
				Address ad= new Address(houseno, areaname, city, state, pincode);
				emp[i]= new Employee(n, eId, s, hD, jp, ph, ad);
				
			
		}
		
		arrangeEmployeeBySalary(emp);
		System.out.println("Employee details in descending order by salary : ");
		for(int i=0; i<emp.length; i++) {
				emp[i].getter();
			
		}
		
		char ch='y'; 
		while(ch=='y') {
			System.out.println("Enter a) get Employee by job position ");
			System.out.println("Enter b) get Employee by hire date  ");
			System.out.println("Enter c) get Employee by salary ");
			System.out.println("Enter d) count foreign emloyees ");
			char choice= sc.next().charAt(0);
			switch (choice) {
			case 'a':
				System.out.println("Enter the job position: ");
				sc.nextLine();
				String jobPos=sc.next();
				getEmployeeByJobPosition(emp, jobPos);
				break;
			case 'b':
				System.out.println("Enter date 1: ");
				int dt1= sc.nextInt();
				int m1= sc.nextInt();
				int y1= sc.nextInt();
				Date d1= new Date(dt1, m1, y1);
				System.out.println("Enter date 2: ");
				int dt2= sc.nextInt();
				int m2=sc.nextInt();
				int y2= sc.nextInt();
				Date d2= new Date(dt2, m2, y2);
				getEmployeeByHireDate(emp, d1,d2);
				break;
			case 'c':
				System.out.println("Enter the salary range salary1 and salary2 :");
				double s1=sc.nextDouble();
				double s2= sc.nextDouble();
				getEmployeeBySalary(emp, s1,s2);
				break;
			case 'd':
				System.out.println(foreignEmployeeCount(emp));
				
				break;
			default:
				System.out.println("Invalid Choice.");
			}
			System.out.println("Another option?(y/n): ");
			ch= sc.next().charAt(0);
		}
		
		
		
		
		
	sc.close();	
	}

}
