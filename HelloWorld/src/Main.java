
public class HelloWorld {
	public static void main(String[] args) {

		System.out.println("\nCreating attendees -> ");
		Attendee atnOne = new Attendee("James Smith");
		atnOne.setAttendeeAge(26);
		atnOne.setAttendeeEmail("jamessmith@gmail.com");
		atnOne.setAttendeePassword("asda");
		atnOne.getAttendeeDetails();

		Attendee atnTwo = new Attendee("Yusuf", "Savas");
		atnTwo.setAttendeeAge(20);
		atnTwo.setAttendeeEmail("yusufsss4@gmail.com");
		atnTwo.setAttendeePassword("asda");
		atnTwo.getAttendeeDetails();

		System.out.println("\nAdding attendees to the list -> ");
		AtendeeList richList = new AtendeeList();
		richList.ReadyAtendeeListOne();
		richList.addElementToList(atnOne);
		richList.getList2();

		Event exampleEvent = new Event();
		exampleEvent.addAtendeListToTheEvent(richList);
		exampleEvent.getAtendees();

		System.out.println("\nTesting the date -> ");
		DateDemo.testTheDate();
		System.out.println("\nDate test is finished -> ");
	}

}

class FreshJuice {
	enum FreshJuiceSize {
		SMALL, MEDIUM, LARGE
	}

	FreshJuiceSize size;
}
