package model;

//creats name class
//uses cusom exceptions to check name is entered correctly
public class Name {
	private String data;

	public Name(String data) throws NameNullException, BlankNameException {
		if (data.isBlank())

			throw new NameNullException("A name cannot be null");
		else if (data.isBlank())
			throw new BlankNameException("blank name is not allowed");
		this.data = data;
	}

	String getPetName() {
		return this.data + "y";
	}

	public String toString() {
		return this.data;
	}
}
