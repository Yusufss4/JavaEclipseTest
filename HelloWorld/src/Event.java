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
		return 3;
	};

	public void setEventName() {
	}

	public void setLocation() {
	}

	public void setDate() {
	}

	public void getEventDetails() {
	}

	public void setManagerId() {
	}

}
