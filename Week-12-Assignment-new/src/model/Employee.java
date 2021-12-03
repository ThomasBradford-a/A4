package model;

//creates class for employee to seperate first and last names
public class Employee {
	private Name firstname;
	private Name lastName;

	Employee(String stringFirstName, String stringLastName) throws NameNullException, BlankNameException {
		this.firstname = new Name(stringFirstName);
		this.lastName = new Name(stringLastName);

	}

	String getFirstName() {
		return this.firstname.toString();
	}

	String getLastName() {
		return this.lastName.toString();
	}

	public String toString() {
		return this.firstname.toString() + "," + this.lastName.toString();
	}

}
