package model;

//creates custom exception
//looks for null left in name
//if so displays a message
public class NameNullException extends Exception {
	NameNullException(String message) {
		super(message);

	}

}
