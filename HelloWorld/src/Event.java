import java.util.ArrayList;
import java.util.Collections; //SORT

public class Event {
	int eventID;
	String eventLocation;
	ArrayList<String> AtendeesForTheEvent;
	public void addAtendeesToTheEvent(ArrayList<String> Atendees) {
		this.AtendeesForTheEvent = Atendees;
	}
	public void getAtendees() {
		System.out.println("\nAtendees in the event");
		 for (int i = 0; i < AtendeesForTheEvent.size(); i++) {
		        System.out.println(AtendeesForTheEvent.get(i));
		      }
		
	}
	

}
