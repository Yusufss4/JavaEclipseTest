public class Attendee {
	String AttendeeFirstName;
	String AttendeeLastName;
	String AttendeeFullName;
	String Password;
	String Email;
	int AttendeeAge;

//Constructor Method 
	public Attendee(String AttendeeFullName) {
		this.AttendeeFullName = AttendeeFullName;
	}

	public Attendee(String AttendeeFirstName, String AttendeeLastName) {
		this.AttendeeFirstName = AttendeeFirstName;
		this.AttendeeLastName = AttendeeLastName;
		AttendeeFullName = AttendeeFirstName + AttendeeLastName;
	}

	public void setAttendeeAge(int AttendeeAge) {
		this.AttendeeAge = AttendeeAge;
	}

	public void setAttendeeEmail(String Email) {
		this.Email = Email;
	}

	public void setAttendeePassword(String Password) {
		this.Password = Password;
	}

	public void getAttendeeDetails() {
		System.out.println("Full Name:" + AttendeeFullName);
		System.out.println("Age:" + AttendeeAge);
		System.out.println("E-Mail:" + Email);
	}

}
