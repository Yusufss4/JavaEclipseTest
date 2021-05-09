import java.util.*;

public class Main {
	public static void main(String[] args) {

		System.out.println("\nCreating attendees -> ");
		Attendee atnOne = new Attendee("James Smith");
		atnOne.setAttendeeAge(26);
		atnOne.setUserEmail("jamessmith@gmail.com");
		atnOne.setUserPassword("asda");
		atnOne.getAttendeeDetails();

		Attendee atnTwo = new Attendee("Yusuf", "Savas");
		atnTwo.setAttendeeAge(20);
		atnTwo.setUserEmail("yusufsss4@gmail.com");
		atnTwo.setUserPassword("asda");
		atnTwo.getAttendeeDetails();

		System.out.println("\nAdding attendees to the list -> ");
		AttendeeList richList = new AttendeeList();
		richList.PopulateExampleAtendeeList();
		richList.addAttendeeToList(atnOne);
		richList.getAttendeeList();

		// Event exampleEvent = new Event();
		// exampleEvent.addAtendeListToTheEvent(richList);
		// exampleEvent.getAtendees();

		System.out.println("\nTesting the date -> ");
		DateDemo.testTheDate();
		System.out.println("\nDate test is finished -> ");

		Concert exampleConcert = new Concert();
		exampleConcert.setEventName("Colorify");
		exampleConcert.addAtendeListToTheEvent(richList);
		exampleConcert.setSingerName("DeadMau5");
		exampleConcert.getEventDetails();
		exampleConcert.getAverageAgeForTheEvent();

		ConcertMenu newMenu = new ConcertMenu();
		newMenu.getAvailableMenuStyles();
		newMenu.addItemsToTheMenu("Menu1");
		newMenu.changeMenuStyle("Menu1");
		newMenu.getMenu();

		Employee empOne = new Employee("John Doe Emp");
		empOne.setEmployeeAge(23);
		empOne.setUserEmail("johndoe@gmail.com");
		empOne.getEmployeeDetails();

		Employee empTwo = new Employee("Emp", "2");
		empTwo.setEmployeeAge(21);
		empTwo.setUserEmail("emp@gmail.com");
		empTwo.getEmployeeDetails();

		Manager mngOne = new Manager("Manager", "Manager");
		mngOne.addEmployeeToTheManager(empOne, mngOne);
		mngOne.addEmployeeToTheManager(empTwo, mngOne);
		mngOne.getEmployeesInTheList();

		GregorianCalendar gcalendar = new GregorianCalendar();
		
		
		int year = 2021;
		int month = 12;
		int dayOfMonth = 30;
		int hour = 10; 
		int minutes = 30;
		
		gcalendar.set(year, month, dayOfMonth, hour, minutes);
		exampleConcert.setEventDate(gcalendar);
		exampleConcert.getEventDateDetais();

	}

}
