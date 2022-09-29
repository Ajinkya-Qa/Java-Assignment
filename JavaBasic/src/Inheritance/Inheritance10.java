package Inheritance;

//parent class
class Company {
	// global variable
	char cmpName;
	int cmpId;
	char empName;

	// method with method overloading use of this keyword
	void display() {
		System.out.println("Company Name :" + this.cmpName);
	}

	void displayCmp(char cmpName) {
		System.out.println("Company Name :" + cmpName);
	}

	void displayCmp(int cmpId, char cmpName) {
		System.out.println("Company Id :" + cmpId + "\nCompany Name :" + cmpName);
	}

	// constructor with overloading and use of this()
	Company() {
		// TODO Auto-generated constructor stub
	}
//
	Company(char cmpName) {
		this.cmpName = cmpName;
	}
//
	Company(int cmpId, char cmpName) {
		this.cmpId = cmpId;
		this.cmpName = cmpName;
	}
}

//child class of Company
class Employee extends Company {
	// global variable name as Company name variable
	char empName;
    static int empId;
    final int fg=0;

	// method with method overloading use of this & super keyword
	void display() {
		this.empName='d';
		System.out.println("Employee Name :" + this.empName);
	}

	void displayEmp(char empName) {
		super.display();
		System.out.println("Employee Name :" + empName);
	}

	void displayEmp(int empId, char empName) {
		System.out.println("Employee Id :" + empId + "\nEmployee Name :" + empName);
	}

	public Employee() {
		super('a');
		this.empName='c';
		this.cmpId=1;
	
	}

	Employee(char empName) {
		super('j');
		this.empName = empName;
	}

//	Employee(int empId, char empName) {
//		super();
//		Employee.empId = empId;
//		super.empName = empName;
//	}
	// constructor with overloading and use of this() & super()
}

public class Inheritance10 {

	public static void main(String[] args) {
		
		double a=70;
//		float as=(float)a;
//		int a= as;
		
		System.out.println(a);

//		Company cp=new Employee();
//		
//		Company cmp=new Employee();
//		Employee emp1=(Employee)cmp;
//		emp1.displayEmp('k');
		// access all the above class members
	}

}