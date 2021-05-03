
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empOne = new Employee("James Smith");
		Employee empTwo = new Employee("Yusuf Savas");
		
		empOne.empAge(26);
		empOne.empDesignation("Software Engineer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		empTwo.empAge(21);
		empTwo.empDesignation("Junior");
		empTwo.empSalary(1000);
		empTwo.printEmployee();

	}

}

class FreshJuice {
	enum FreshJuiceSize {SMALL,MEDIUM,LARGE}
	FreshJuiceSize size;
}


