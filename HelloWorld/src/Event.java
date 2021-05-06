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
	AtendeeList AttendeeListForTheEvent = new AtendeeList();

	Event() {
	} // Constructor

	public void addAtendeListToTheEvent(AtendeeList AttendeeListForTheEvent) {
		this.AttendeeListForTheEvent = AttendeeListForTheEvent;
	}

	public void getAtendees() {
		System.out.println("\nAtendees in the event");
		AttendeeListForTheEvent.getList2();
	}

	public int getAttendeeNumber() {
		return 1;
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
