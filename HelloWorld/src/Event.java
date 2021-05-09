import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.*; //Can be used for sorting

abstract class Event {

	int eventID;
	String eventName;
	int managerId;
	int participantAmount;
	int eventType;
	GregorianCalendar eventDate = new GregorianCalendar();
	String eventLocation;
	AttendeeList AttendeeListForTheEvent = new AttendeeList();
	Manager managerOfTheEvent = new Manager();

	Event() {
	} // Constructor

	public void addAtendeListToTheEvent(AttendeeList AttendeeListForTheEvent) {
		this.AttendeeListForTheEvent = AttendeeListForTheEvent;
	}

	public void getAtendees() {
		System.out.println("\nAttendees in the event");
		AttendeeListForTheEvent.getAttendeeList();
	}

	public int getAttendeeNumber() {
		return AttendeeListForTheEvent.getAttendeeListSize();
	};

	public float getAverageAgeForTheEvent() {
		float averageAgeForTheEvent = AttendeeListForTheEvent.getAverageAgeForTheList();
		System.out.printf("\nAverage age for the event is -> %.2f", averageAgeForTheEvent);
		return averageAgeForTheEvent;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public void setLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public void setEventDate(GregorianCalendar eventDate) {
		this.eventDate = eventDate;
	}
	
	public void getEventDateDetais() {
		String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		int year;
		System.out.print("Date: ");
		System.out.print(months[eventDate.get(Calendar.MONTH)]);
		System.out.print(" " + eventDate.get(Calendar.DATE) + " ");
		System.out.println(year = eventDate.get(Calendar.YEAR));
		System.out.print("Time: ");
		System.out.print(eventDate.get(Calendar.HOUR) + ":");
		System.out.print(eventDate.get(Calendar.MINUTE));
		if(eventDate.get(Calendar.AM_PM) == 1) {
			System.out.println("PM");
		}
		else { System.out.println("AM"); }
	}

	public void addManagerToTheEvent(Manager managerOfTheEvent) {
		this.managerOfTheEvent = managerOfTheEvent;

	}

	abstract void getEventDetails();

}
