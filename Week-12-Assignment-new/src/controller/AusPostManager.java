package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

import view.AusPostUI;

//imports everything required\
//also creats counter and bufferedreader
public class AusPostManager {
	private Account[] accounts;
	private int currentNumAccounts;
	private BufferedReader br;
	private AusPostUI ausPostUI;

	// creates array
	// sets it to a capacity of 10
	public AusPostManager() {
		// make sure you initialse as an array
		this.accounts = new Account[10];
		// because this is account just assignt it a 0
		this.currentNumAccounts = 0;
		this.br = null;
	}

//creates method for adding of accounts
	// creates an if statement
	// creates a tracking number
	/// alteritivly i could of made the cost an float
	public void addAccount(String name, double cost) throws Exception {
		if (this.currentNumAccounts < this.accounts.length) {
			String trackingNumber = String.format("%07d", this.currentNumAccounts);
			this.accounts[this.currentNumAccounts] = new Account(trackingNumber, name, cost);
			this.currentNumAccounts += 1;
		}
	}

	public String getAllAccounts() {
		String summary = "";
		int i = 0;
		while (i < this.currentNumAccounts) {
			summary += this.accounts[i] + "\n";
			i += 1;

		}
		return summary;
	}

}
