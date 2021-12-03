package model;

//a class for emplyess of aus post
//seperates full time and part time
//also uses custom exceptions
//uses a counter to check against capacity
public class EmployeeDataStructure {
	private Employee[] employees;
	private int counter;

	public EmployeeDataStructure() {
		this.employees = new Employee[10];
		this.counter = 0;
	}

	public void add(String name) throws NameNullException, BlankNameException {
		if (this.counter < this.employees.length) {
			this.employees[this.counter] = new Employee(name, name);
			this.counter += 1;
		}
	}

	public void addPartTimeEmployee(String name) throws NameNullException, BlankNameException {
		if (this.counter < this.employees.length) {
			this.employees[this.counter] = new PartTimeEmployee(name, name);
			this.counter += 1;
		}
	}

	public String toString() {
		String summary = "";
		int i = 0;
		while (i < this.counter) {
			summary += this.employees[i];
			i += 1;
		}
		return summary;
	}
}
