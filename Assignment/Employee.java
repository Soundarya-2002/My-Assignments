package Assignment;

public class Employee {
	public void GetEmployeeInfo(int empId) {
		System.out.println(empId);
		
	}
	public void GetEmployeeInfo(int empId,String empName) {
		System.out.println(empId+","+empName);
		
	}
	public void GetEmployeeInfo(int empId,String empName,String empEmail) {
		System.out.println(empId+","+empName+","+empEmail);
		
	}
	public void GetEmployeeInfo(int empId,String empName,String empEmail,long empPhoneNo) {
		System.out.println(empId+","+empName+","+empEmail+","+empPhoneNo);
		
		}

public static void main(String[]args) {
	Employee Emp=new Employee();
	Emp.GetEmployeeInfo(19290);
	Emp.GetEmployeeInfo(19290,"Soundarya");
	Emp.GetEmployeeInfo(19290,"Soundarya","sound02@gmail.com");
	Emp.GetEmployeeInfo(19290,"Soundarya","sound02@gmail.com",9629261272L);
}
	
}


