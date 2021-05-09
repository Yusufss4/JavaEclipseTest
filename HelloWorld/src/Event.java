import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.text.*; //Can be used for sorting

abstract class Event {

	int eventID;
	String eventName;
	int managerId;
	int participantAmount;
	int eventType;
	Date eventDate = new Date();
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

	public void setDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public void addManagerToTheEvent(Manager managerOfTheEvent) {
		this.managerOfTheEvent = managerOfTheEvent;

	}

	abstract void getEventDetails();

}
