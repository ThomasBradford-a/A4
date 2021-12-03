package model;

//extends employye class
//adds part time employee
//returns to string
public class PartTimeEmployee extends Employee {

	PartTimeEmployee(String stringFirstName, String stringLastName) throws NameNullException, BlankNameException {
		super(stringFirstName, stringLastName);

	}

	public String toString() {

		return super.toString();

	}
}
