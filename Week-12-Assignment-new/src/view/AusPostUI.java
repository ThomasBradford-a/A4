package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

import controller.*;

public class AusPostUI {
//creating variables and buffered reader
	// also importing backend
	private String title;
	private BufferedReader br;

	private AusPostManager AusPostManager;

	public AusPostUI(String title) {
		// initialsing and setting up menu

		this.title = title;
		this.AusPostManager = new AusPostManager();

		// if there are member variables for which we dont hjave initial values for, we
		// must still initialse them with something (e.g null)
		// setting up a while loop to work its way threw the menu
		// alteritivly i could of used a for loop but as the assignment said to only use
		// while loops thats what i did
		System.out.print("welcome to " + this.title);
		String menu = "";
		menu += "\nMenu\n";
		menu += "[A]dd account\n";
		menu += "[D]isplay all accounts\n";
		menu += "[S]ave to file\n";
		menu += "[L]oad from file\n";
		menu += "e[x]it\n";
		menu += "Choice: ";
		String choice;
		choice = get_input(menu);

		while (!choice.equalsIgnoreCase("x")) {

			if (choice.equalsIgnoreCase("a")) {
				String name = get_input("Enter name: ");
				double balance = Double.parseDouble(get_input("Enter Balance: "));
				try {
					this.AusPostManager.addAccount(name, balance);
				} catch (Exception e) {
					String message = "problem! " + e.getMessage() + "/n";
					System.out.println(message);
					e.printStackTrace();
				}
			} else if (choice.equalsIgnoreCase("d")) {
				String summary = this.AusPostManager.getAllAccounts();
				System.out.println(summary);
			} else if (choice.equalsIgnoreCase("s")) {
				writeTofile(choice);
			} else if (choice.equalsIgnoreCase("l")) {
				read_from_file(choice);
			}
			choice = get_input(menu);
		}
	}

//creating the get_input method which i labbled as what it does
	// alteritivly i could of used scanner for inputs but i chose to us buffered
	// Reader
	public String get_input(String menu) {
		String input = null;
		try {
			if (this.br == null)
				this.br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(menu);

			input = br.readLine();
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("oops");
		}
		return input;
	}

//creating the write to file method
	// im not to sure about alteritives for this one i did have a bit of trouble
	// trying to get it to work
	public void writeTofile(String filename) {
		try {
			BufferedWriter rf = new BufferedWriter(new FileWriter(filename));

			String line = get_input("please entere details to save to file");
			while (!line.isBlank()) {
				rf.write(line + "\n");
				line = get_input("please entere details to save to file");
			}
			rf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//creating the read from file method
	// also unsure on alterinitives sor this method
	public void read_from_file(String filename) {
		try {
			BufferedReader rf = new BufferedReader(new FileReader(filename));

			String line;
			line = rf.readLine();
			while (line != null) {
				System.out.println(line);
				line = rf.readLine();
			}
			rf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//links to objects
	public static void main(String[] args) {

		AusPostUI obj = new AusPostUI("Australia Post");

	}

}
