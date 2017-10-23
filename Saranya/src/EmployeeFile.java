
public class EmployeeFile {
	//Instance Variables
	static String empName = "Saranya";
	String name;
	int age;
	String design;
	double salary;
	
	public static void printEmp() {
		System.out.println("inside static method"+empName);
	}
	//constructor of the class Employee
	public EmployeeFile(String name) {
		this.name=name;
	}
	public EmployeeFile() {
		
	}
	public EmployeeFile(String empname,int empage, double empsalary) {
		name=empname;
		age=empage;
		salary=empsalary;
	}
	//Assign the age of the Employee  to the variable age.
	public void EmpAge(int empage){
		age=empage;
	}
	//Assign the designation to the variable designation
	public void EmpDest(String empdesign){
		design=empdesign;
	}
	//Assign the salary to the variable	salar
	public void EmpSalary(int empsalary){
		salary=empsalary;
	}
	
	//Print the Employee details
	public void printDetails(){
		System.out.println("Details of the Employee :\nname "+name+",\nage "+age+"\nDesignation "+design+"\nSalary "+salary);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeFile emp1 = new EmployeeFile("James Smith");
		EmployeeFile emp2 = new EmployeeFile("Mary Anne");
		EmployeeFile emp3 = new EmployeeFile("Saranya",33,100000);
		EmployeeFile emp4 = new EmployeeFile();
		emp1.EmpAge(26);
		emp1.EmpDest("Senior Software Engineer");
		emp1.EmpSalary(1000);
		emp1.printDetails();
		
		emp2.EmpAge(21);
		emp2.EmpDest("Software Engineer");
		emp2.EmpSalary(500);
		emp2.printDetails();
		
		emp3.printDetails();
		emp4.EmpAge(21);
		emp4.EmpDest("Software Engineer");
		emp4.EmpSalary(500);
		emp4.printDetails();
	}

}