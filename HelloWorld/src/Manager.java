import java.util.ArrayList;

public class Manager extends User {
	private String ManagerFirstName;
	private String ManagerLastName;
	private String ManagerFullName;
	private int ManagerAge;
	private ArrayList<Employee> EmployeesInTheList = new ArrayList<Employee>();

	
	public Manager() {}
	
	public Manager(String ManagerFullName) {
		this.ManagerFullName = ManagerFullName;
	}

	public Manager(String ManagerFirstName, String ManagerLastName) {
		this.ManagerFirstName = ManagerFirstName;
		this.ManagerLastName = ManagerLastName;
		ManagerFullName = ManagerFirstName +" "+ ManagerLastName;
	}
	
	public void addEmployeeToTheManager(Employee newEmployee,Manager managerOfTheEmployee) {
		EmployeesInTheList.add(newEmployee);
		newEmployee.addManagerToTheEmployee(managerOfTheEmployee);
		
	}
	
	public void revomeEmployeeFromTheManager(Employee newEmployee) {
		EmployeesInTheList.remove(newEmployee);
	}

	public void getEmployeesInTheList() {
		for (int i = 0; i < this.EmployeesInTheList.size(); i++) {
			this.EmployeesInTheList.get(i).getEmployeeDetails();
		}
	}
	
	public void getManagerDetails() {
		System.out.println(""+ ManagerFullName);
	}
	
	public String getManagerFullName() {
		return ManagerFullName;
	}
	public void getUserDetails() {};
	
	
	
	
	
	
	

}
