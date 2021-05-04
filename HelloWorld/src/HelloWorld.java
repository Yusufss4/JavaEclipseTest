
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empOne = new Employee("James Smith");
		Employee empTwo = new Employee("Yusuf Savas");
		boolean result = empOne instanceof Employee;
		System.out.println("Result:"+ result );
		
		empOne.empAge(26);
		empOne.empDesignation("Software Engineer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		empTwo.empAge(21);
		empTwo.empDesignation("Junior");
		empTwo.empSalary(1000);
		empTwo.printEmployee();
		
		int [] numbers = {10,20,30,40};
		for(int x: numbers) {
			System.out.print(x);
			System.out.print(",");
		}
		String[] names = {"Yusuf","Savsas","Test"};
		for(String name: names) {
			System.out.print(name);
			System.out.print(",");
		}
		
		System.out.println("\nARRAY TEST -> ");
		ArrayTest arrayTest  = new ArrayTest();
		int[] newArray = {1,2,3,4};
		arrayTest.testTheArray(newArray);
		ArrayTest.testTheArray2(newArray);
		newArray = ArrayTest.reverseTheArray(newArray);
		ArrayTest.testTheArray2(newArray);
		System.out.println("\nARRAY TEST FINISHED -> ");

		System.out.println("\nDATE TEST -> ");
		DateDemo.testTheDate();
		System.out.println("\nDATE TEST FINISHED -> ");
	}

}

class FreshJuice {
	enum FreshJuiceSize {SMALL,MEDIUM,LARGE}
	FreshJuiceSize size;
}


