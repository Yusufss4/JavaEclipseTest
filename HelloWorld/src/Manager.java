import java.util.ArrayList;

final class Manager extends User {
	private String ManagerFirstName;
	private String ManagerLastName;
	private String ManagerFullName;
	private int ManagerAge;
	ArrayList<Employee> EmployeesInTheList = new ArrayList<Employee>();
	
	public void addEmployeeToTheManager(Employee newEmployee) {
		EmployeesInTheList.add(newEmployee);
	}
	
	public void revomeEmployeeFromTheManager(Employee newEmployee) {
		EmployeesInTheList.remove(newEmployee);
	}

	public void getEmployeesInTheList() {
		for (int i = 0; i < this.EmployeesInTheList.size(); i++) {
			this.EmployeesInTheList.get(i).getEmployeeDetails();
		}
	}
	
	
	
	
	
	
	

}
