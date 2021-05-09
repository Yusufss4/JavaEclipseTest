import java.util.*;

public class Main {
	static List<User> users = new ArrayList<User>();
	public static void main(String[] args) {

		
		
		Scanner scnner = new Scanner(System.in);
		System.out.println("Hello Admin! Please select one of the options:");
		System.out.println("1 - Attendee Menu");
		System.out.println("2 - Employee Menu");
		System.out.println("3 - Manager Menu");
		System.out.println("4 - Event Menu");
		System.out.println("5 - Food Menu");
		System.out.print("Waiting for your option... ->"); 
		int option = scnner.nextInt();  
		
		switch (option) {
		case 1:
			System.out.println("\nAttendee Menu - Please select one of the options:");
			System.out.println("1 - Create Attendee");
			System.out.println("2 - Get Attendee Details");
			System.out.print("Waiting for your option... ->"); 
			option = scnner.nextInt();
			switch (option) {
			case 1: createAttendee(); break;
			case 2: System.out.println("Please enter the e-mail of the Attendee: ");
			String email = scnner.nextLine();
			findAndGetUserDetails(email);
			break;
			}
			
			break;
		case 2:
			System.out.println("Employee Menu - Please select one of the options:");
			System.out.println("1 - Create Employee");
			System.out.println("2 - Get Employee Details");
			option = scnner.nextInt(); 
			switch (option) {
			case 1: createEmployee(); break;
			case 2: System.out.println("Please enter the e-mail of the Employee: ");
			String email = scnner.nextLine();
			findAndGetUserDetails(email);
			break;
			}
			break;
		case 3:
			System.out.println("Manager Menu");
			String fullName;
			System.out.println("Please enter full name of the manager: ");
			fullName = scnner.nextLine();
			Manager mngOne = new Manager(fullName);
			System.out.println("Please enter the age of the manager: ");
			int age = scnner.nextInt();
			System.out.println("Please enter the e-mail of the manager: ");
			String email = scnner.nextLine();
			mngOne.setUserEmail(email);
			System.out.println("Please create the employee that you want to assign");
			System.out.println("Please enter full name of the employee: ");
			fullName = scnner.nextLine();
			Employee newEmp = new Employee(fullName);
			users.add(newEmp);
			System.out.println("Please enter the age of the employee: ");
			age = scnner.nextInt();
			newEmp.setEmployeeAge(age);
			System.out.println("Please enter the e-mail of the employee: ");
			email = scnner.nextLine();
			newEmp.setUserEmail(email);
			mngOne.addEmployeeToTheManager(newEmp, mngOne);
			mngOne.getManagerDetails();
			break;
		case 4:
			
			break;
		default:
			System.out.println("Wrong option is selected.");
		}
		
	
//		Attendee atnOne = new Attendee("James Smith");
//		atnOne.setAttendeeAge(26);
//		atnOne.setUserEmail("jamessmith@gmail.com");
//		atnOne.setUserPassword("asda");
//		atnOne.getAttendeeDetails();

//		Attendee atnTwo = new Attendee("Yusuf", "Savas");
//		atnTwo.setAttendeeAge(20);
//		atnTwo.setUserEmail("yusufsss4@gmail.com");
//		atnTwo.setUserPassword("asda");
//		atnTwo.getAttendeeDetails();
//
//		System.out.println("\nAdding attendees to the list -> ");
//		AttendeeList newList = new AttendeeList();
//		newList.addAttendeeToList(atnOne);
//		newList.getAttendeeList();
//
//		Concert exampleConcert = new Concert();
//		exampleConcert.setEventName("Colorify");
//		exampleConcert.addAtendeListToTheEvent(newList);
//		exampleConcert.setSingerName("DeadMau5");
//		exampleConcert.getAverageAgeForTheEvent();
//		float eventTicketPrice = 13.45f;
//		exampleConcert.setEventTicketPrice(eventTicketPrice);
//
//		ConcertMenu newMenu = new ConcertMenu();
//		newMenu.getAvailableMenuStyles();
//		newMenu.addItemsToTheMenu("Menu1");
//		newMenu.changeMenuStyle("Menu1");
//		newMenu.getMenu();
//		exampleConcert.setMenuStyle(newMenu);
//
//		Employee empOne = new Employee("John Doe Emp");
//		empOne.setEmployeeAge(23);
//		empOne.setUserEmail("johndoe@gmail.com");
//		empOne.getEmployeeDetails();
//
//		Employee empTwo = new Employee("Emp", "2");
//		empTwo.setEmployeeAge(21);
//		empTwo.setUserEmail("emp@gmail.com");
//		empTwo.getEmployeeDetails();
//
//		Manager mngOne = new Manager("Manager","Manager");
//		mngOne.addEmployeeToTheManager(empOne, mngOne);
//		mngOne.addEmployeeToTheManager(empTwo, mngOne);
//		mngOne.getEmployeesInTheList();
//		exampleConcert.addManagerToTheEvent(mngOne);
//
//		GregorianCalendar gcalendar = new GregorianCalendar();
//
//		int year = 2021;
//		int month = 12;
//		int dayOfMonth = 30;
//		int hour = 10;
//		int minutes = 30;
//
//		gcalendar.set(year, month, dayOfMonth, hour, minutes);
//		exampleConcert.setEventDate(gcalendar);
//		exampleConcert.getEventDateDetais();
//
//		char eventCode = 'C';
//		exampleConcert.eventCode = eventCode;
//		System.out.printf("\nEvent code of the event is -> %c\n", exampleConcert.eventCode);
//
//		boolean eventVisibility = true;
//		exampleConcert.isEventVisible = eventVisibility;
//		
//		exampleConcert.getEventDetails();
	}

	static public void createEmployee() {
		String option;
		String fullName;
		Scanner scnner = new Scanner(System.in);
		System.out.println("Please enter full name of the employee: ");
		fullName = scnner.nextLine();
		Employee newEmp = new Employee(fullName);
		users.add(newEmp);
		System.out.println("Please enter the age of the employee: ");
		int age = scnner.nextInt();
		newEmp.setEmployeeAge(age);
		System.out.println("Please enter the e-mail of the employee: ");
		String email = scnner.nextLine();
		newEmp.setUserEmail(email);
		findAndGetUserDetails(email);
	}
	
	static public void findAndGetUserDetails(String email) {
	      for (User element : users){
	          if (element.getUserEmail().equals(email)){
	                element.getUserDetails();
	          }
	       }
	}
	
	static public void createAttendee() {
		String option;
		String fullName;
		Scanner scnner = new Scanner(System.in);
		System.out.println("Please enter full name of the attendee: ");
		fullName = scnner.nextLine();
		Attendee newAtn = new Attendee(fullName);
		users.add(newAtn);
		System.out.println("Please enter the age of the attendee: ");
		int age = scnner.nextInt();
		newAtn.setAttendeeAge(age);
		System.out.println("Please enter the e-mail of the attendee: ");
		String email = scnner.nextLine();
		newAtn.setUserEmail(email);
		findAndGetUserDetails(email);
		
	}
	
	
}




