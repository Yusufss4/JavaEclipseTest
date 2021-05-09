public class Employee extends User {
	private String EmployeeFirstName;
	private String EmployeeLastName;
	private String EmployeeFullName;
	private int EmployeeAge;
	Manager managerOfTheEmployee = new Manager();

	public Employee(String EmployeeFullName) {
		this.EmployeeFullName = EmployeeFullName;
	}

	public Employee(String EmployeeFirstName, String EmployeeLastName) {
		this.EmployeeFirstName = EmployeeFirstName;
		this.EmployeeLastName = EmployeeLastName;
		EmployeeFullName = EmployeeFirstName +" "+ EmployeeLastName;
	}

	public void getEmployeeDetails() {
		System.out.println("Full Name:" + EmployeeFullName);
		System.out.println("Age:" + EmployeeAge);
		System.out.println("E-Mail:" + Email);
		System.out.println("Manager of the Employee:");
		managerOfTheEmployee.getManagerDetails();
		System.out.println("\nAttented Event of the Employee:");
	}
	
	public void getUserDetails() {
		System.out.println("Full Name:" + EmployeeFullName);
		System.out.println("Age:" + EmployeeAge);
		System.out.println("E-Mail:" + Email);
		System.out.println("Manager of the Employee:");
		managerOfTheEmployee.getManagerDetails();
		System.out.println("\nAttented Event of the Employee:");
	}

	public void setEmployeeAge(int EmployeeAge) {
		this.EmployeeAge = EmployeeAge;
	}

	public int getEmployeeAge() {
		System.out.printf("The Attendee %s's age %d", EmployeeFullName, EmployeeAge);
		return EmployeeAge;
	}

	public void addManagerToTheEmployee(Manager managerOfTheEmployee) {
		this.managerOfTheEmployee = managerOfTheEmployee;
	}

}
