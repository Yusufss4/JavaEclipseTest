import java.util.ArrayList;
import java.util.Collections; //SORT

public class Event {
	int eventID;
	String eventLocation;
	ArrayList<String> AtendeesForTheEvent;
	AtendeeList AtendeeListForTheEvent = new AtendeeList();
	public void addAtendeListToTheEvent(AtendeeList AtendeeListForTheEvent) {
		this.AtendeeListForTheEvent = AtendeeListForTheEvent;
	}
	public void getAtendees() {
		System.out.println("\nAtendees in the event");
			 AtendeeListForTheEvent.getList2();
	}
	

}
