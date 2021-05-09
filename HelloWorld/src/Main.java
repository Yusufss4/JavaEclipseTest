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
		AttendeeList newList = new AttendeeList();
		newList.addAttendeeToList(atnOne);
		newList.getAttendeeList();

		Concert exampleConcert = new Concert();
		exampleConcert.setEventName("Colorify");
		exampleConcert.addAtendeListToTheEvent(newList);
		exampleConcert.setSingerName("DeadMau5");
		exampleConcert.getAverageAgeForTheEvent();
		float eventTicketPrice = 13.45f;
		exampleConcert.setEventTicketPrice(eventTicketPrice);

		ConcertMenu newMenu = new ConcertMenu();
		newMenu.getAvailableMenuStyles();
		newMenu.addItemsToTheMenu("Menu1");
		newMenu.changeMenuStyle("Menu1");
		newMenu.getMenu();
		exampleConcert.setMenuStyle(newMenu);

		Employee empOne = new Employee("John Doe Emp");
		empOne.setEmployeeAge(23);
		empOne.setUserEmail("johndoe@gmail.com");
		empOne.getEmployeeDetails();

		Employee empTwo = new Employee("Emp", "2");
		empTwo.setEmployeeAge(21);
		empTwo.setUserEmail("emp@gmail.com");
		empTwo.getEmployeeDetails();

		Manager mngOne = new Manager("Manager","Manager");
		mngOne.addEmployeeToTheManager(empOne, mngOne);
		mngOne.addEmployeeToTheManager(empTwo, mngOne);
		mngOne.getEmployeesInTheList();
		exampleConcert.addManagerToTheEvent(mngOne);

		GregorianCalendar gcalendar = new GregorianCalendar();

		int year = 2021;
		int month = 12;
		int dayOfMonth = 30;
		int hour = 10;
		int minutes = 30;

		gcalendar.set(year, month, dayOfMonth, hour, minutes);
		exampleConcert.setEventDate(gcalendar);
		exampleConcert.getEventDateDetais();

		char eventCode = 'C';
		exampleConcert.eventCode = eventCode;
		System.out.printf("\nEvent code of the event is -> %c\n", exampleConcert.eventCode);

		boolean eventVisibility = true;
		exampleConcert.isEventVisible = eventVisibility;
		
		exampleConcert.getEventDetails();

	}

}
