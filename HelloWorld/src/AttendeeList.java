import java.util.ArrayList;
import java.util.Collections; //SORT

public class AttendeeList {
	//ArrayList<String> cars = new ArrayList<String>();
	ArrayList<Attendee> AttendeesInTheList = new ArrayList<Attendee>();

	public void PopulateExampleAtendeeList() {

	}

	public void addAttendeeToList(Attendee newAttendee) {
		AttendeesInTheList.add(newAttendee);
	}

	public int getAttendeeListSize() {
		return this.AttendeesInTheList.size();
	}

	public float getAverageAgeForTheList() {
		float avarageAttendeeAge = 0;
		int AttendeeListSize = this.AttendeesInTheList.size();
		for (int i = 0; i < AttendeeListSize; i++) {
			avarageAttendeeAge +=  this.AttendeesInTheList.get(i).getAttendeeAge();
		}
		return avarageAttendeeAge/AttendeeListSize;
	}
	
	public void getAttendeeList() {
		for (int i = 0; i < this.AttendeesInTheList.size(); i++) {
			this.AttendeesInTheList.get(i).getAttendeeDetails();
		}
	}
	

}
