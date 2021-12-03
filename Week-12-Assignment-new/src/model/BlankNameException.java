package model;

//creates custom exception to check if name was left blank
public class BlankNameException extends Exception {
	BlankNameException(String message) {
		super(message);
	}

}
