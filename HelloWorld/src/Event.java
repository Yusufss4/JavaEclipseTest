import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.text.*; //Can be used for sorting

public class Event {

	int eventID;
	String eventName;
	int managerId;
	int participantAmount;
	int eventType;
	Date eventDate = new Date();
	String eventLocation;
	AttendeeList AttendeeListForTheEvent = new AttendeeList();

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
		return 1;
	};

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public void setLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public void setDate() {
	}

	public void getEventDetails(Concert exampleConcert) {
		System.out.println("Full Name:" + eventName);
		System.out.println("Event Type:" + eventType);
		System.out.println("Singer Name:" + exampleConcert.singerName);
		System.out.println("Event Name:" + exampleConcert.eventName);
	}
	
	public void getEventDetails() {
		System.out.println("Full Name:" + eventName);
		System.out.println("Event Type:" + eventType);
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

}
