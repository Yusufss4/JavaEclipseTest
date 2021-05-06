import java.util.ArrayList;
import java.util.Collections; //SORT

public class AtendeeList {
	ArrayList<String> cars = new ArrayList<String>();
	ArrayList<Attendee> EmployeesInTheList = new ArrayList<Attendee>();

	public void ReadyAtendeeListOne() {

		this.cars.add("Volvo");
		this.cars.add("BMW");
		this.cars.add("Ford");
		this.cars.add("Mazda");

		System.out.println(this.cars);

		for (int i = 0; i < this.cars.size(); i++) {
			System.out.println(this.cars.get(i));
		}

		Collections.sort(this.cars); // Sort cars
		for (String i : this.cars) {
			System.out.println(i);
		}
	}

	public void addElementToList(Attendee newEmployee) {
		EmployeesInTheList.add(newEmployee);
	}

	public ArrayList<String> getList() {
		return cars;
	}

	public int size() {
		return this.EmployeesInTheList.size();
	}

	public ArrayList<String> getList2() {
		for (int i = 0; i < this.EmployeesInTheList.size(); i++) {
			this.EmployeesInTheList.get(i).getAttendeeDetails();
		}
		return cars;
	}

}
